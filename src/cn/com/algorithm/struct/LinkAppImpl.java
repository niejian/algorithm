package cn.com.algorithm.struct;

import java.util.ArrayList;
import java.util.List;

public class LinkAppImpl extends LinkApp {
	

		private List<NodeStruct> nodeList = new ArrayList<>();
		
		@Override
		public NodeStruct getNode(int index) {
			return this.nodeList.get(index);
		}
	
		@Override
		public void addNode(NodeStruct nodeStruct, Integer index) {
			
			synchronized(this.nodeList) {
				int size = this.nodeList.size();
				//位置在index上的上一个节点数据
				NodeStruct oldPreNode = null;
				//位置在index上的下一个节点数据
				NodeStruct oldNextNode = null;
				//位置在index上的节点数据
				NodeStruct oldNode = null;
				
				if(null != index && index >= 0) {
					 
					oldNode = this.getNode(index);
					//获取原链表中的index +  1节点
					oldNextNode = oldNode.getNext();
					oldPreNode = oldNode.getPre();
					//修改链表之间的连接关系
					//位置在index上的前置节点设置为新节点的前置节点，新节点的后置节点设置为原inedx上的节点
					if(null != oldNode) {
						oldNode.setPre(nodeStruct);
						nodeStruct.setNext(oldNode);
					}
					
					if(null != oldPreNode) {
						nodeStruct.setPre(oldPreNode);
						oldPreNode.setNext(nodeStruct);
					}
					
				}else {
					//没有索引，往链表末尾添加
					if(size == 0) {
						oldNode = null;
					}else {
						//如果index为空，则添加到链表的最后位置
						oldNode = this.nodeList.get(size - 1);
						oldNode.setNext(nodeStruct);
						nodeStruct.setPre(oldNode);
					}
					
				}
					
				
				
//				if(null != oldNextNode) {
//					
//				}
//				
//				if(null != preNode && null != preNode.getPre()) {
//					preNode = preNode.getPre();
//					nodeStruct.setPre(preNode);
//					preNode.setNext(nodeStruct);
//				}
//				
//				if(null != nextNode) {
//					nodeStruct.setNext(nextNode);
//					nextNode.setPre(nextNode);
//				}
				
				this.nodeList.add(size, nodeStruct);	
			}
		}
	
	
		@Override
		public void removeNode(Object nodeStruct, Integer index) {
			synchronized(this.nodeList) {
				int size = this.nodeList.size();
				if(null != index && index >= 0 && index <= size) {
					NodeStruct node = this.getNode(index);
					if(null != node) {
						//获取前一个节点
						NodeStruct preNode = node.getPre();						
						//获取后一个节点
						NodeStruct nextNode = node.getNext();
						
						if(null != preNode) {
							preNode.setNext(nextNode);
						}
						
						if(null != nextNode) {
							nextNode.setPre(preNode);
						}
						this.nodeList.remove(node);
						
					}
				}
			}
		}
		
		/**
		 * 
		 */
		@Override
		public int indexOf(Object obj) {
			int index = -1;
			boolean isContinue = true;
			for(int i = 0; i < this.nodeList.size(); i++) {
				
				NodeStruct node = this.nodeList.get(i);
				if(null != node) {
					Object val = node.getVal();
					if(obj.equals(val)) {
						index = i;
						isContinue = false;
					}
					
					if(isContinue && null != node.getPre()
							&& node.getPre().equals(obj)) {
						index = i - 1;
					}
					
					if(isContinue && null != node.getNext()
							&& node.getNext().equals(obj)) {
						index = i + 1;
					}				
				}
				
			}
			return index;
		}
		
}
