/* Time Complexity O(N)  */

public boolean isheightBlanaced()
	{
		if(hb(root)>=0)
		return true;
		else
		return false;
	}
	private int hb(Node root)
	{
		if(root==null)
		return 0;
		int hl = hb(root.left);
		int hr = hb(root.right);
		if(hl<0||hr<0||Math.abs(hr-hl)>1) return -1;
		else
		return Math.max(hr,hl)+1;
		
	}
