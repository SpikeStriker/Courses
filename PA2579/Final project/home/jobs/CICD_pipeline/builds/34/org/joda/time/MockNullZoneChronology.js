var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":44,"id":22381,"methods":[{"el":30,"sc":5,"sl":28},{"el":33,"sc":5,"sl":31},{"el":36,"sc":5,"sl":34},{"el":39,"sc":5,"sl":37},{"el":42,"sc":5,"sl":40}],"name":"MockNullZoneChronology","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2099":{"methods":[{"sl":28}],"name":"testSetTime_Object3","pass":true,"statements":[{"sl":29}]},"test_2292":{"methods":[{"sl":28},{"sl":34}],"name":"testSetZoneRetainFields_DateTimeZone4","pass":true,"statements":[{"sl":29},{"sl":35}]},"test_2323":{"methods":[{"sl":28},{"sl":37}],"name":"testWithZoneRetainFields_DateTimeZone","pass":true,"statements":[{"sl":29},{"sl":38}]},"test_2671":{"methods":[{"sl":28}],"name":"testToDateTimeISO","pass":true,"statements":[{"sl":29}]},"test_4085":{"methods":[{"sl":28}],"name":"testWithZoneRetainFields_DateTimeZone","pass":true,"statements":[{"sl":29}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2099, 4085, 2323, 2671, 2292], [2099, 4085, 2323, 2671, 2292], [], [], [], [], [2292], [2292], [], [2323], [2323], [], [], [], [], [], []]
