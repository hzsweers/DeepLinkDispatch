/*
 * Copyright (C) 2015 Airbnb, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.airbnb.deeplinkdispatch;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that this activity will receive deep links, so the processor knows not to generate
 * a separate activity.
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.CLASS)
public @interface DeepLinkActivity {
    String ACTION = "com.airbnb.deeplinkdispatch.DEEPLINK_ACTION";
    String EXTRA_SUCCESSFUL = "com.airbnb.deeplinkdispatch.EXTRA_SUCCESSFUL";
    String EXTRA_URI = "com.airbnb.deeplinkdispatch.EXTRA_URI";
    String EXTRA_ERROR_MESSAGE = "com.airbnb.deeplinkdispatch.EXTRA_ERROR_MESSAGE";
}
