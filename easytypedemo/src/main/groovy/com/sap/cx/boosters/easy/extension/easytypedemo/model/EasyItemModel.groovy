package com.sap.cx.boosters.easy.extension.easytypedemo.model

import de.hybris.bootstrap.annotations.Accessor
import de.hybris.platform.core.model.ItemModel
import de.hybris.platform.servicelayer.model.ItemModelContext

class EasyItemModel extends ItemModel {
    public static final String _TYPECODE = "EasyItem"

    public static final String CODE = "code";
	
	public static final String NAME = "name";

    public EasyItemModel()
	{
		super();
	}
	
	public EasyItemModel(final ItemModelContext ctx)
	{
		super(ctx);
	}

    @Accessor(qualifier = "code", type = Accessor.Type.GETTER)
	public String getCode()
	{
		return getPersistenceContext().getPropertyValue(CODE);
	}

    @Accessor(qualifier = "code", type = Accessor.Type.SETTER)
	public void setCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CODE, value);
	}

    @Accessor(qualifier = "name", type = Accessor.Type.GETTER)
	public String getName()
	{
		return getName(null);
	}

	@Accessor(qualifier = "name", type = Accessor.Type.GETTER)
	public String getName(final Locale loc)
	{
		return getPersistenceContext().getLocalizedValue(NAME, loc);
	}
	
}
