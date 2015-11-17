package hipster.controller;

import hipster.view.HipsterFrame;
import hipster.model.Hipster;

public class HipsterAppController
{
	private Hipster firstHipster;
	private HipsterFrame baseFrame;
	
	public HipsterAppController()
	{
		firstHipster = new Hipster();
		baseFrame = new HipsterFrame(this);
	}
	
	public void start()
	{
		String myName = baseFrame.getResponse("What is your name fellow hipppppster?");
		firstHipster.setName(myName);
		baseFrame.setTitle(myName + "'s Hipster Project");
	}
	
	public Hipster getFirstHipster()
	{
		return firstHipster;
	}
	
	public HipsterFrame getBaseFrame()
	{
		return baseFrame;
	}
}
