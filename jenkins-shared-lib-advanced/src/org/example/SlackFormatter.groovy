package org.example

class SlackFormatter {
    static String format(String template, String status) {
        return template.replace("{{STATUS}}", status)
    }
}
