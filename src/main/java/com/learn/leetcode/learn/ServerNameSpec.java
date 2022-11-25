
package com.learn.leetcode.learn;

import java.util.Collections;
import java.util.List;
import javax.net.ssl.SNIServerName;

record ServerNameSpec(List<SNIServerName> serverNames) {
    ServerNameSpec(List<SNIServerName> serverNames) {
        this.serverNames = Collections.unmodifiableList(serverNames);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(512);
        serverNames.forEach(sn -> builder.append(sn.toString()));
        return builder.toString();
    }
}