package cn.com.algorithm.struct;

/**
 * 定义链表节点
 * @desc 
 * @author Winters
 * @date 2018年6月14日
 */
public class NodeStruct {
	private NodeStruct pre;
	private NodeStruct next;
	private Object val;
	public NodeStruct getPre() {
		return pre;
	}
	public void setPre(NodeStruct pre) {
		this.pre = pre;
	}
	public NodeStruct getNext() {
		return next;
	}
	public void setNext(NodeStruct next) {
		this.next = next;
	}
	public Object getVal() {
		return val;
	}
	public void setVal(Object val) {
		this.val = val;
	}
	
	
	

}
