package cn.com.algorithm.test;

import java.util.Arrays;
import java.util.List;

import cn.com.algorithm.struct.LinkApp;
import cn.com.algorithm.struct.LinkAppImpl;
import cn.com.algorithm.struct.NodeStruct;

public class LinkTest {

	public static void main(String[] args) {
		LinkApp linkApp = new LinkAppImpl();
		
		NodeStruct nodeStruct = new NodeStruct();
		nodeStruct.setPre(null);
		nodeStruct.setNext(null);
		nodeStruct.setVal(1);
		
		linkApp.addNode(nodeStruct, null);
		
		nodeStruct = new NodeStruct();
		nodeStruct.setPre(null);
		nodeStruct.setNext(null);
		nodeStruct.setVal(2);
		linkApp.addNode(nodeStruct, null);
		
		nodeStruct = new NodeStruct();
		nodeStruct.setPre(null);
		nodeStruct.setNext(null);
		nodeStruct.setVal(55);
		linkApp.addNode(nodeStruct, 1);
		
		nodeStruct = new NodeStruct();
		nodeStruct.setPre(null);
		nodeStruct.setNext(null);
		nodeStruct.setVal(3);
		linkApp.addNode(nodeStruct, 1);
		
		
		
		List<Integer> list = Arrays.asList(new Integer[] {1,2,3,4});
		System.out.println(list.get(0));
		
		
	}
}
