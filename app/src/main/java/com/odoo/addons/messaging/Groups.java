package com.odoo.addons.messaging;

import android.content.Context;

import com.odoo.core.support.addons.fragment.BaseFragment;
import com.odoo.core.support.drawer.ODrawerItem;

import java.util.List;


/*
*this class is use to get all groups that had already been created in the model
* in other to send a sms to all it members. Because our philosophy it that an sms
* can only be send to a group . A group been made of at least one customer
 */


public class Groups extends BaseFragment {
    @Override
    public List<ODrawerItem> drawerMenus(Context context) {
        return null;
    }

    @Override
    public <T> Class<T> database() {
        return null;
    }
}
