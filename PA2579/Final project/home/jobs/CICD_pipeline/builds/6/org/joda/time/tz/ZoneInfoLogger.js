var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":41,"id":22211,"methods":[{"el":26,"sc":9,"sl":24},{"el":35,"sc":5,"sl":33},{"el":39,"sc":5,"sl":37}],"name":"ZoneInfoLogger","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1170":{"methods":[{"sl":37}],"name":"testCompileOnBrokenTimeZoneFile","pass":true,"statements":[{"sl":38}]},"test_1606":{"methods":[{"sl":33},{"sl":37}],"name":"testCompile","pass":true,"statements":[{"sl":34},{"sl":38}]},"test_3737":{"methods":[{"sl":24},{"sl":33}],"name":"testDateTimeZoneBuilder","pass":true,"statements":[{"sl":25},{"sl":34}]},"test_651":{"methods":[{"sl":37}],"name":"testCompileOnBrokenTimeZoneFile_2","pass":true,"statements":[{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3737], [3737], [], [], [], [], [], [], [], [3737, 1606], [3737, 1606], [], [], [651, 1606, 1170], [651, 1606, 1170], [], [], []]
