# mobile-detect

A lightweight Java library for detecting mobile devices.

Based on [MobileESP](http://code.google.com/p/mobileesp/), the code has been moved to github and made available via Maven Central.

## Usage

Add this to your maven project

    <dependency>
      <groupId>au.com.flyingkite</groupId>
      <artifactId>mobiledetect</artifactId>
      <version>1.1.1</version>
    </dependency>

Then call the library like so:

    // setup the class with the user agent
    UAgentInfo agentInfo = new UAgentInfo(userAgent, null);
    
    // check if mobile device
    boolean isMobileDevice = agentInfo.detectMobileQuick();
    
    //or perhaps check if it is a tablet
    boolean isTabletDevice = agentInfo.detectTierTablet();
