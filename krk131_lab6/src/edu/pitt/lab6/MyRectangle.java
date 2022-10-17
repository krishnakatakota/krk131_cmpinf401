package edu.pitt.lab6;

public class MyRectangle
{
	private int width, height, startX, startY;

	public MyRectangle()
	{
		width = 0;
		height = 0;
		startX = 0;
		startY = 0;
	}

	public MyRectangle(int x, int y, int w, int h)
	{
		width = w;
		height = h;
		startX = x;
		startY = y;
	}

	public int area()
	{
		return width * height;
	}

	// I have written this method for you.  Note how a StringBuilder is
	// utilized, since (as we discussed in lecture) it can be modified
	// without having to create a new object each time (unlike a String).
	public String toString()
	{
		StringBuilder S = new StringBuilder();
		S.append("Width: " + width);
		S.append(" Height: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
	}

	public boolean isInside(int x, int y) {
		boolean inX = (x >= startX && x <= startX + width);
		boolean inY = (y >= startY && y <= startY + height);

		return (inY && inX);
	}

	public void setSize(int w, int h)
	{
		width = w;
		height = h;
	}

	public void setPosition(int x, int y)
	{
		startX = x;
		startY = y;
	}

}