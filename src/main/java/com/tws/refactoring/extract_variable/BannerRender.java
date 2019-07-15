package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        boolean isIeorMac = (platform.toUpperCase().contains("MAC")) &&
                (browser.toUpperCase().contains("IE"));
        if (isIeorMac) {
            return "IE on Mac?";
        }
        return "banner";
    }
}
