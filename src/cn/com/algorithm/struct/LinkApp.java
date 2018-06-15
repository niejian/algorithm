package cn.com.algorithm.struct;

public abstract class LinkApp {

	
	/**
	 * 在指定的位置上面添加一个节点
	 * @param nodeStruct
	 * @param index
	 */
	public void addNode(NodeStruct nodeStruct, Integer index) {
	}
	
	/**
	 * 在指定的位置上面移除某个节点
	 * @param nodeStruct
	 * @param index
	 */
	public void removeNode(Object nodeStruct, Integer index) {
		
	}
	
	/**
	 * 获取指定位置上面的节点
	 * @param index
	 */
	public NodeStruct getNode(int index) {
		return null;
	}
	
	/**
	 * 获取目标元素索引
	 * @param obj
	 * @return
	 */
	public int indexOf(Object obj) {
		return -1;
	}
}
