package com.odoo.addons.messaging;

import android.content.Context;

import com.odoo.core.support.addons.fragment.BaseFragment;
import com.odoo.core.support.drawer.ODrawerItem;

import java.util.List;


/*
*this class is created to make easy the creation of groups from the mobile
*/

public class CreateGroup extends BaseFragment {
    @Override
    public List<ODrawerItem> drawerMenus(Context context) {
        return null;
    }

    @Override
    public <T> Class<T> database() {
        return null;
    }
}
