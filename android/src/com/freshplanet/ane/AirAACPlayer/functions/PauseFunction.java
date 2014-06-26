package com.freshplanet.ane.AirAACPlayer.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.freshplanet.ane.AirAACPlayer.ExtensionContext;

public class PauseFunction implements FREFunction
{
	@Override
    public FREObject call(FREContext context, FREObject[] args) 
    {
    	((ExtensionContext)context).pause();
    	return null;
    }
}
