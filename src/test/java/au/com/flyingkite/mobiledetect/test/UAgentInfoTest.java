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
	private final String SYMBIAN = "Mozilla/5.0 (SymbianOS/9.1; U; en-us) AppleWebKit/413 (KHTML, like Gecko) Safari/413";
	private final String S60 = "Mozilla/5.0 (SymbianOS/9.2; Series60/3.1 NokiaN95/21.0.004; Profile/MIDP-2.0 Configuration/CLDC-1.1 U; ) AppleWebKit/413 (KHTML, like Gecko) Safari/413";
	private final String SONY_ERICSSON = "SonyEricssonK750i/R1CA Browser/SEMC-Browser/4.2 Profile/MIDP-2.0 Configuration/CLDC-1.1";
	private final String NETFRONT = "SonyEricssonK310iv/R4DA Browser/NetFront/3.3 Profile/MIDP-2.0 Configuration/CLDC-1.1";
	private final String SAMSUNG_SGH_X820 = "SEC-SGHX820/1.0 NetFront/3.2 Profile/MIDP-2.0 Configuration/CLDC-1.1";
	private final String SAMSUNG_SGH_X210 = "SEC-SGHX210/1.0";
	private final String ANDROID = "Mozilla/5.0 (Linux; U; Android 1.5; en-gb; HTC Magic Build/CRA71C) AppleWebKit/528.5+ (KHTML, like Gecko) Version/3.1.2 Mobile Safari/525.20.1";
	private final String PLAYSTATION = "Mozilla/5.0 (PLAYSTATION 3; 3.55);";
	private final String WII = "Opera/9.30 (Nintendo Wii; U; ; 2071; Wii Shop Channel/1.0; en)";
	
	
	private final String SAFARI_MAC = "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10_6_8; en-us) AppleWebKit/534.57.2 (KHTML, like Gecko) Version/5.1.6 Safari/534.57.2";
	private final String IE9 = "Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0;";

	
	/**
	 * Detect an iPhone
	 */
	@Test
	public void detectIphone() {
		UAgentInfo agent = new UAgentInfo(IOS_IPHONE_433, null);
		Assert.assertEquals(true, agent.detectIphone());
	}
	
	/**
	 * Fail to detect an iPhone by sending Safari
	 */
	@Test
	public void detectIphoneFailViaSafari() {
		UAgentInfo agent = new UAgentInfo(SAFARI_MAC, null);
		Assert.assertEquals(false, agent.detectIphone());
	}
	
	/**
	 * Detect an iPod
	 */
	@Test
	public void detectIpod() {
		UAgentInfo agent = new UAgentInfo(IOS_IPOD_433, null);
		Assert.assertEquals(true, agent.detectIpod());
	}
	
	/**
	 * Fail to detect an iPod by sending Safari
	 */
	@Test
	public void detectIpodFailViaSafari() {
		UAgentInfo agent = new UAgentInfo(SAFARI_MAC, null);
		Assert.assertEquals(false, agent.detectIpod());
	}
	
	/**
	 * Detect an iPad
	 */
	@Test
	public void detectIpad() {
		UAgentInfo agent = new UAgentInfo(IOS_IPAD_433, null);
		Assert.assertEquals(true, agent.detectIpad());
	}
	
	/**
	 * Fail to detect an iPad by sending Safari
	 */
	@Test
	public void detectIpadFailViaSafari() {
		UAgentInfo agent = new UAgentInfo(SAFARI_MAC, null);
		Assert.assertEquals(false, agent.detectIpad());
	}
	
	/**
	 * Fail to detect an iPad by sending IE9
	 */
	@Test
	public void detectIpadFailViaIe9() {
		UAgentInfo agent = new UAgentInfo(IE9, null);
		Assert.assertEquals(false, agent.detectIpad());
	}
	
	
	/**
	 * Detect iOS via iPad
	 */
	@Test
	public void detectIosViaIpad() {
		UAgentInfo agent = new UAgentInfo(IOS_IPAD_433, null);
		Assert.assertEquals(true, agent.detectIos());
	}
	
	/**
	 * Detect iOS via iPhone
	 */
	@Test
	public void detectIosViaIphone() {
		UAgentInfo agent = new UAgentInfo(IOS_IPHONE_433, null);
		Assert.assertEquals(true, agent.detectIos());
	}
	
	/**
	 * Detect iOS via iPod
	 */
	@Test
	public void detectIosViaIpod() {
		UAgentInfo agent = new UAgentInfo(IOS_IPOD_433, null);
		Assert.assertEquals(true, agent.detectIos());
	}
	
	/**
	 * Detect iOS and fail because of Safari
	 */
	@Test
	public void detectIosFailViaSafari() {
		UAgentInfo agent = new UAgentInfo(SAFARI_MAC, null);
		Assert.assertEquals(false, agent.detectIos());
	}
	
	/**
	 * Detect iPod or iPhone via iPhone
	 */
	@Test
	public void detectIpodOrIphoneViaIphone() {
		UAgentInfo agent = new UAgentInfo(IOS_IPHONE_433, null);
		Assert.assertEquals(true, agent.detectIphoneOrIpod());
	}
	
	/**
	 * Detect iPod or iPhone via iPod
	 */
	@Test
	public void detectIpodOrIphoneViaIpod() {
		UAgentInfo agent = new UAgentInfo(IOS_IPOD_433, null);
		Assert.assertEquals(true, agent.detectIphoneOrIpod());
	}
	
	/**
	 * Detect iPod or iPhone and fail because of Safari
	 */
	@Test
	public void detectIpodOrIphoneViaIphoneFailViaSafari() {
		UAgentInfo agent = new UAgentInfo(SAFARI_MAC, null);
		Assert.assertEquals(false, agent.detectIphoneOrIpod());
	}
	

	/**
	 * Detect a Playstation
	 */
	@Test
	public void detectPlaystation() {
		UAgentInfo agent = new UAgentInfo(PLAYSTATION, null);
		Assert.assertEquals(true, agent.detectSonyPlaystation());
	}
	
	/**
	 * Detect a Wii
	 */
	@Test
	public void detectWii() {
		UAgentInfo agent = new UAgentInfo(WII, null);
		Assert.assertEquals(true, agent.detectNintendo());
	}
	
	/**
	 * Detect an Android device
	 */
	@Test
	public void detectAndroid() {
		UAgentInfo agent = new UAgentInfo(ANDROID, null);
		Assert.assertEquals(true, agent.detectAndroid());
	}
	
	
	
	/**
	 * Test that iPhone is in the iPhone tier
	 */
	@Test
	public void testIphoneInIphoneTier() {
		UAgentInfo agent = new UAgentInfo(IOS_IPHONE_433, null);
		Assert.assertEquals(true, agent.getIsTierIphone());
	}
	
	/**
	 * Test that iPad is in the tablet tier
	 */
	@Test
	public void testIpadInTabletTier() {
		UAgentInfo agent = new UAgentInfo(IOS_IPAD_433, null);
		Assert.assertEquals(true, agent.getIsTierTablet());
	}
	
	/**
	 * Test that a legacy device is in mobile phone group
	 */
	@Test
	public void testGenericMobileViaLegacy() {
		UAgentInfo agent = new UAgentInfo(SONY_ERICSSON, null);
		Assert.assertEquals(true, agent.getIsTierGenericMobile());
	}
	
	
	
	/**
	 * Test that an iPhone is in the quick test
	 */
	@Test
	public void testGenericMobileViaIphone() {
		UAgentInfo agent = new UAgentInfo(IOS_IPHONE_433, null);
		Assert.assertEquals(true, agent.detectMobileQuick());
	}
	
	/**
	 * Test that an iPod is in the quick test
	 */
	@Test
	public void testGenericMobileViaIpod() {
		UAgentInfo agent = new UAgentInfo(IOS_IPOD_433, null);
		Assert.assertEquals(true, agent.detectMobileQuick());
	}
	
	
	
	

}
