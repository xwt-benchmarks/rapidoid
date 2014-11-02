package org.rapidoid.pages.bootstrap;

/*
 * #%L
 * rapidoid-pages
 * %%
 * Copyright (C) 2014 Nikolche Mihajlovski
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

import org.rapidoid.pages.Widget;
import org.rapidoid.pages.html.DivTag;
import org.rapidoid.pages.html.SpanTag;
import org.rapidoid.pages.html.TableTag;

public abstract class BootstrapWidget extends Widget {

	@Override
	public TableTag table(Object... contents) {
		return super.table(contents).classs("table");
	}

	public DivTag row(Object... contents) {
		return div(contents).classs("row");
	}

	public DivTag container(Object... contents) {
		return div(contents).classs("container");
	}

	public SpanTag icon(String icon) {
		return span().classs("icon-" + icon);
	}

}
