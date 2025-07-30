package org.example

class BuildHelper {
    static boolean isStableBranch(String branch) {
        return branch ==~ /main|release.*/
    }

    static String getShortCommit(String hash) {
        return hash.take(7)
    }
}
