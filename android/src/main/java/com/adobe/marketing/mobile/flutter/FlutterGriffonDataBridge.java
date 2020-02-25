/*
Copyright 2020 Adobe. All rights reserved.
This file is licensed to you under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License. You may obtain a copy
of the License at http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software distributed under
the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
OF ANY KIND, either express or implied. See the License for the specific language
governing permissions and limitations under the License.
*/

package com.adobe.marketing.mobile.flutter;

import com.adobe.marketing.mobile.Griffon;

public class FlutterGriffonDataBridge {

    static Griffon.UILogColorVisibility getVisibilityFromInt(String visibility) {
        switch (visibility) {
            case "ACPGRIFFON_UI_LOG_COLOR_LOW": return Griffon.UILogColorVisibility.LOW;
            case "ACPGRIFFON_UI_LOG_COLOR_NORMAL": return Griffon.UILogColorVisibility.NORMAL;
            case "ACPGRIFFON_UI_LOG_COLOR_HIGH": return Griffon.UILogColorVisibility.HIGH;
            case "ACPGRIFFON_UI_LOG_COLOR_CRITICAL": return Griffon.UILogColorVisibility.CRITICAL;
            default:
                return null;

        }
    }

}
