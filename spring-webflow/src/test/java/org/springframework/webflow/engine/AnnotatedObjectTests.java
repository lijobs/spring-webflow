/*
 * Copyright 2004-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.webflow.engine;

import junit.framework.TestCase;

import org.springframework.webflow.core.AnnotatedObject;

public class AnnotatedObjectTests extends TestCase {

	private AnnotatedObject object = new Flow("foo");

	public void testSetCaption() {
		object.setCaption("caption");
		assertEquals("caption", object.getCaption());
	}

	public void testSetDescription() {
		object.setDescription("description");
		assertEquals("description", object.getDescription());
	}

	public void testPutCustomAttributes() {
		object.getAttributes().put("foo", "bar");
		assertEquals("bar", object.getAttributes().get("foo"));
	}

}
