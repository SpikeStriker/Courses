var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":41,"id":22211,"methods":[{"el":26,"sc":9,"sl":24},{"el":35,"sc":5,"sl":33},{"el":39,"sc":5,"sl":37}],"name":"ZoneInfoLogger","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_260":{"methods":[{"sl":33},{"sl":37}],"name":"testCompile","pass":true,"statements":[{"sl":34},{"sl":38}]},"test_2937":{"methods":[{"sl":24},{"sl":33}],"name":"testDateTimeZoneBuilder","pass":true,"statements":[{"sl":25},{"sl":34}]},"test_3709":{"methods":[{"sl":37}],"name":"testCompileOnBrokenTimeZoneFile","pass":true,"statements":[{"sl":38}]},"test_717":{"methods":[{"sl":37}],"name":"testCompileOnBrokenTimeZoneFile_2","pass":true,"statements":[{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2937], [2937], [], [], [], [], [], [], [], [260, 2937], [260, 2937], [], [], [260, 717, 3709], [260, 717, 3709], [], [], []]
