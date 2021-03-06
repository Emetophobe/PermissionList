/*
 * Copyright (C) 2013-2015 Mike Cunningham
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

package com.emetophobe.permissionviewer.ui.permissionlist;

import com.emetophobe.permissionviewer.model.PermissionDetail;
import com.hannesdorfmann.mosby.mvp.lce.MvpLceView;

import java.util.List;


public interface PermissionListView extends MvpLceView<List<PermissionDetail>> {
	// // all method are derived MvpLceView for now
}
