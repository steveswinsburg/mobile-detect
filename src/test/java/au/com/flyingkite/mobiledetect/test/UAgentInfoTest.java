/**
 * Copyright 2011-2012 Flying Kite Pty Ltd
 *
 * Based on the original work by Anthony Hand, 2010-2012
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package au.com.flyingkite.mobiledetect.test;
/**
 * Copyright 2011-2011 Flying Kite Pty Ltd
 *
 * Based on the original work by Anthony Hand, 2010-2011
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
import junit.framework.Assert;

import org.junit.Test;

import au.com.flyingkite.mobiledetect.UAgentInfo;

/**
 * Some test to check the UAgentInfo class is working as expected.
 * 
 * @author Steve Swinsvurg (steve.swinsburg@gmail.com)
 *
 */
public class UAgentInfoTest {

	private final String IOS_IPHONE_433 = "Mozilla/5.0 (iPhone; U; CPU iPhone OS 4_3_3 like Mac OS X; en-us) AppleWebKit/533.17.9 (KHTML, like Gecko) Version/5.0.2 Mobile/8J2 Safari/6533.18.5";
	private final String IOS_IPOD_433 = "Mozilla/5.0 (iPod; U; CPU iPhone OS 4_3_3 like Mac OS X; en-us) AppleWebKit/533.17.9 (KHTML, like Gecko) Version/5.0.2 Mobile/8J2 Safari/6533.18.5";
	private final String IOS_IPAD_433 = "Mozilla/5.0 (iPad; U; CPU OS 4_3_3 like Mac OS X; en-us) AppleWebKit/533.17.9 (KHTML, like Gecko) Version/5.0.2 Mobile/8J2 Safari/6533.18.5";
	
	//todo add more user agents here and more tests
	// /Applications/Safari.app/Contents/Resources/UserAgents.plist
	
	@Test
	public void testIphoneTier() {
				
		UAgentInfo agent = new UAgentInfo(IOS_IPHONE_433, null);
		Assert.assertEquals(true, agent.getIsTierIphone());
		
	}
	
	@Test
	public void testIphoneExact() {
		
		UAgentInfo agent = new UAgentInfo(IOS_IPHONE_433, null);
		Assert.assertEquals(true, agent.getIsIphone());
		
	}
	
	@Test
	public void testNotIphone() {
		
		UAgentInfo agent = new UAgentInfo(IOS_IPAD_433, null);
		Assert.assertEquals(false, agent.getIsIphone());
		
	}

}
