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
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialDatePicker;
import gwt.material.design.client.ui.MaterialIcon;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialToast;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Templated
@Page(path = "new")
public class NewPage {

    @Inject
    @DataField
    MaterialIcon icon;

    @Inject
    @DataField
    MaterialLabel label;
    
    @Inject
    @DataField
    private MaterialDatePicker dpGetSetDate;

    @Inject
    @DataField
    private MaterialButton btnGetDate;

    @Inject
    @DataField
    private MaterialButton btnSetDate;

    @PostConstruct
    public void init() {
        icon.setIconType(IconType.POLYMER);
        label.setText("NEW PAGE");
        buildGetSetDate();
    }
    
    private void buildGetSetDate() {
        dpGetSetDate.setPlaceholder("Date");
        btnGetDate.setText("Get Date");
        btnGetDate.addClickHandler(clickEvent -> {
            MaterialToast.fireToast("Value " + dpGetSetDate.getValue());
        });

        btnSetDate.setText("Set Date Today");
        btnSetDate.addClickHandler(clickEvent -> {
            dpGetSetDate.setDate(new Date());
        });
    }
}
