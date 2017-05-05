# mobile-detect

A lightweight Java library for detecting mobile devices.

Based on [MobileESP](https://github.com/ahand/mobileesp), the code has been moved to github and made available via Maven Central.

## Usage

Add this to your maven project
```xml
<dependency>
  <groupId>au.com.flyingkite</groupId>
  <artifactId>mobiledetect</artifactId>
  <version>1.1.1</version>
</dependency>
```

Then call the library like so:

```java
// setup the class with the user agent
UAgentInfo agentInfo = new UAgentInfo(userAgent, null);
    
// check if mobile device
boolean isMobileDevice = agentInfo.detectMobileQuick();
    
//or perhaps check if it is a tablet
boolean isTabletDevice = agentInfo.detectTierTablet();
```
