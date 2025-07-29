#!/bin/bash
#
# Usage: ./run_test.sh <TEST_NAME> <SLEEP_TIME_SECONDS>
#
TEST_NAME=$1
SLEEP=$2
mkdir -p reports
echo "Sleeping ${SLEEP}s for ${TEST_NAME}"; sleep "${SLEEP}"
cat > reports/TEST-${TEST_NAME}.xml <<EOF
<?xml version="1.0" encoding="UTF-8"?>
<testsuite tests="1" failures="0">
  <testcase classname="Dummy" name="${TEST_NAME}" time="${SLEEP}"/>
</testsuite>
EOF
