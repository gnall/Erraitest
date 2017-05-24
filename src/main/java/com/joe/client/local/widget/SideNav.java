/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.joe.client.local.widget;


import com.google.gwt.user.client.ui.Composite;
import com.google.inject.Inject;
import com.joe.client.dto.DataHelper;
import com.joe.client.dto.Link;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialSideNavPush;

import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;

@Templated
public class SideNav extends Composite {

    @Inject
    @DataField
    MaterialSideNavPush sideNav;

    @PostConstruct
    protected void init() {
        sideNav.setId("sideNav");
        sideNav.setWidth(280);
        sideNav.reinitialize();
        for (Link l : DataHelper.getAppLinks()) {
        	MaterialLink link = new MaterialLink();
        	if (l.getIcon() != null) {
        		link.setIconType(l.getIcon());
        	}
        	link.setText(l.getName());
                if (l.getHref() != null) {
                    link.setHref(l.getHref());
                }
                sideNav.add(link);
            }
        }
        /*MaterialLink googleLink = new MaterialLink("Google");
        MaterialLink redditLink = new MaterialLink("Reddit");	
        MaterialLink facebookLink = new MaterialLink("Facebook");
        googleLink.setHref("http://www.google.com");
        redditLink.setHref("http://www.reddit.com");
        facebookLink.setHref("http://127.0.0.1:8888/index.html#new");
        googleLink.setIconType(IconType.POLYMER);
        redditLink.setIconType(IconType.POLYMER);
        facebookLink.setIconType(IconType.POLYMER);
        sideNav.add(googleLink);
        sideNav.add(redditLink);
        sideNav.add(facebookLink);*/
}
