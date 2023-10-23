package org.hotswap.agent.plugin.spring.xml.scan;

import org.springframework.beans.factory.annotation.Value;

public class XmlItem {
    @Value("${scan.item.name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
