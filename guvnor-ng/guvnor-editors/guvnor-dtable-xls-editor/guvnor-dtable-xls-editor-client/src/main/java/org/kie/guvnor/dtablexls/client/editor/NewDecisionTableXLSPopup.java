/*
 * Copyright 2005 JBoss Inc
 *
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
 */

package org.kie.guvnor.dtablexls.client.editor;

import org.kie.guvnor.dtablexls.client.resources.i18n.DecisionTableXLSEditorConstants;
import org.kie.guvnor.dtablexls.client.resources.images.ImageResources;
import org.uberfire.backend.vfs.Path;
import org.uberfire.client.common.FormStylePopup;

import com.google.gwt.user.client.Command;

public class NewDecisionTableXLSPopup extends FormStylePopup {

    public NewDecisionTableXLSPopup(final Path contextPath, final String fileName, final Command createdCallback) {
        super(ImageResources.INSTANCE.decisionTable(),
                DecisionTableXLSEditorConstants.INSTANCE.NewDecisionTableDescription() );

        addAttribute( "", new AttachmentFileWidget(contextPath, fileName, new Command() {
            @Override
            public void execute() {
                hide();
                createdCallback.execute();
            }
            
        }));
    }

 }
