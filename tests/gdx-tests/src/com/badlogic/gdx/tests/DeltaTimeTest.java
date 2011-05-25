/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.badlogic.gdx.tests;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.tests.utils.GdxTest;

public class DeltaTimeTest extends GdxTest {

	@Override public boolean needsGL20 () {
		return false;
	}

	long lastFrameTime;
	
	@Override public void create() {
		lastFrameTime = System.nanoTime();
	}
	
	@Override public void render() {
		long frameTime = System.nanoTime();
		float deltaTime = (frameTime - lastFrameTime) / 1000000000.0f;		
		lastFrameTime = frameTime;
		
		Gdx.app.log("DeltaTimeTest", "delta: " + deltaTime + ", gdx delta: " + Gdx.graphics.getDeltaTime());
	}
}