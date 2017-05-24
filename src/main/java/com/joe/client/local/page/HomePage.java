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
package com.joe.client.local.page;

import gwt.material.design.client.constants.ButtonSize;
import gwt.material.design.client.constants.ButtonType;
import gwt.material.design.client.constants.Color;

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


import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.constants.WavesType;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCollection;
import gwt.material.design.client.ui.MaterialCollectionItem;
import gwt.material.design.client.ui.MaterialDatePicker;
import gwt.material.design.client.ui.MaterialFAB;
import gwt.material.design.client.ui.MaterialFABList;
import gwt.material.design.client.ui.MaterialIcon;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialToast;

import org.jboss.errai.common.client.logging.util.Console;
import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.event.dom.client.ClickEvent;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Templated
@Page(path = "home", role = DefaultPage.class)
public class HomePage {

    @Inject
    @DataField
    MaterialIcon icon;

    @Inject
    @DataField
    MaterialLabel label;
    
    @Inject
    @DataField
    MaterialLabel label2;
    
    @Inject
    @DataField
    private MaterialCollection collectionBasic;
    
    @Inject
    @DataField
    private MaterialFAB fabBasic;
    
    
    

    @PostConstruct
    public void init() {
        icon.setIconType(IconType.POLYMER);
        label.setText("GWT Material Errai");
        buildBasic();
        buildFABBasic();
    }
    
    private void buildBasic() {
        buildCollection(collectionBasic);
    }
    
    private void buildCollection(MaterialCollection collection) {
    	for (int i = 1; i <= 5; i++) {
    		MaterialCollectionItem item = new MaterialCollectionItem();
    		MaterialLink link = new MaterialLink("Collection Item " + i);
    		link.setHref("http://www.google.com");
            item.add(link);
            collection.add(item);
        }
       
    }
    
    private void buildFABBasic() {
        buildFAB(fabBasic);
    }
    
    private void buildFAB(MaterialFAB fab) {
        MaterialFABList fabList = new MaterialFABList();
        MaterialButton btn1 = new MaterialButton();
        btn1.setIconType(IconType.POLYMER);
        btn1.setType(ButtonType.FLOATING);
        btn1.setSize(ButtonSize.LARGE);
        btn1.setWaves(WavesType.LIGHT);
        fab.add(btn1);

        MaterialButton btn2 = new MaterialButton();
        btn2.setIconType(IconType.POLYMER);
        btn2.setType(ButtonType.FLOATING);
        btn2.setBackgroundColor(Color.PURPLE);
        btn2.setWaves(WavesType.LIGHT);
        fabList.add(btn2);

        MaterialButton btn3 = new MaterialButton();
        btn3.setIconType(IconType.POLYMER);
        btn3.setType(ButtonType.FLOATING);
        btn3.setBackgroundColor(Color.RED);
        btn3.setWaves(WavesType.LIGHT);
        fabList.add(btn3);

        MaterialButton btn4 = new MaterialButton();
        btn4.setIconType(IconType.POLYMER);
        btn4.setType(ButtonType.FLOATING);
        btn4.setBackgroundColor(Color.GREEN);
        btn4.setWaves(WavesType.LIGHT);
        fabList.add(btn4);
        fab.add(fabList);
    }
}
