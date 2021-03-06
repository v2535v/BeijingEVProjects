package com.earthview.world.spatial;

import global.*;
import com.earthview.world.base.*;
import com.earthview.world.util.*;
import com.earthview.world.core.*;

public class AttributionElementClassFactory implements IClassFactory {
	public BaseObject create()
	{
		AttributionElement emptyInstance = new AttributionElement(CreatedWhenConstruct.CWC_NotToCreate);
		return emptyInstance;
	}
}
