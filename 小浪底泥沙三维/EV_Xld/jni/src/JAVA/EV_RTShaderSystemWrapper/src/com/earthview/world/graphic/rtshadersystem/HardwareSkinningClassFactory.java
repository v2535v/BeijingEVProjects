package com.earthview.world.graphic.rtshadersystem;

import global.*;
import com.earthview.world.base.*;
import com.earthview.world.util.*;
import com.earthview.world.core.*;

public class HardwareSkinningClassFactory implements IClassFactory {
	public BaseObject create()
	{
		HardwareSkinning emptyInstance = new HardwareSkinning(CreatedWhenConstruct.CWC_NotToCreate);
		return emptyInstance;
	}
}
