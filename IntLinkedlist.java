class IntLinkedlist
{
Node headnode,lastnode;
public void insert(int value)
{
	Node node=new Node(value,null);

	if(headnode==null)
	{
		headnode=node;
	}
	if(lastnode!=null)
	{
	lastnode.setNextnode(node);	
	}
	lastnode=node;
	
}
public void printList()
{
	if(headnode== null)
	{
		System.out.println("LinkedList Empty");
		
	}
	Node node=headnode;
	while(node!=null)
	{
		System.out.println(node.getValue());
		node=node.getnextNode();
	}
		
}

public void removeALL()
{
	headnode=null;
}
public void removeTail()
{
	Node node=headnode;
	Node previousnode=node;
	while(true)
	{
		//node=node.getnextNode();
		if(node.getnextNode()==null)
		{
			previousnode.setNextnode(null);
			break;
		}
		previousnode=node;
		node=node.getnextNode();
		
	}
	
}


}


class Node
{
	
	int value;
	Node nextnode;
	public Node(int value, Node nextnode )
	{
		this.value=value;
		this.nextnode=nextnode;
	}		
	public void setValue(int value)
	{
		this.value=value;
	}
	public int getValue()
	{
		return value;
	}
	public void setNextnode(Node nextnode)
	{
		this.nextnode=nextnode;
	}
	public Node getnextNode()
	{
		return nextnode;
	}
	
	
}


class Testing 
{
	public static void main(String args[])
	{
		IntLinkedlist ilist=new IntLinkedlist();
		ilist.insert(4);
		ilist.insert(5);
		ilist.insert(6);
		ilist.insert(7);
		ilist.printList();
		ilist.removeTail();
		ilist.printList();
		
	}
}