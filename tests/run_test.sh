#!/bin/bash

# Log the script start
echo "===== Starting test: $1 ====="
echo "Current directory: $(pwd)"

TEST_NAME=$1
SLEEP=$2

# Log the test parameters
echo "Test name: $TEST_NAME"
echo "Sleep duration: $SLEEP seconds"

# Create output directory
REPORT_DIR="/home/mahmoud/Desktop/jenkins/jenkins/tests/reports"
mkdir -p "$REPORT_DIR"
echo "Created report directory: $REPORT_DIR"

# Simulate test execution
echo "Sleeping for $SLEEP seconds to simulate test..."
sleep "$SLEEP"

# Create test result XML
XML_PATH="${REPORT_DIR}/TEST-${TEST_NAME}.xml"
echo "Writing JUnit XML to: $XML_PATH"

cat > "$XML_PATH" <<EOF
<?xml version="1.0" encoding="UTF-8"?>
<testsuite tests="1" failures="0">
  <testcase classname="Dummy" name="${TEST_NAME}" time="${SLEEP}"/>
</testsuite>
EOF

# Confirm result
echo "Generated test result XML:"
cat "$XML_PATH"

# Log completion
echo "===== Finished test: $TEST_NAME ====="
