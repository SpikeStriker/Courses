var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":477,"id":6590,"methods":[{"el":88,"sc":5,"sl":71},{"el":103,"sc":5,"sl":100},{"el":126,"sc":5,"sl":117},{"el":142,"sc":5,"sl":136},{"el":167,"sc":5,"sl":164},{"el":187,"sc":5,"sl":180},{"el":199,"sc":5,"sl":197},{"el":208,"sc":5,"sl":206},{"el":218,"sc":5,"sl":216},{"el":227,"sc":5,"sl":225},{"el":245,"sc":5,"sl":243},{"el":263,"sc":5,"sl":261},{"el":281,"sc":5,"sl":279},{"el":300,"sc":5,"sl":298},{"el":320,"sc":5,"sl":317},{"el":330,"sc":5,"sl":328},{"el":347,"sc":5,"sl":342},{"el":363,"sc":5,"sl":358},{"el":377,"sc":5,"sl":375},{"el":393,"sc":5,"sl":388},{"el":407,"sc":5,"sl":405},{"el":424,"sc":5,"sl":419},{"el":435,"sc":5,"sl":433},{"el":449,"sc":5,"sl":444},{"el":462,"sc":5,"sl":457},{"el":475,"sc":5,"sl":472}],"name":"Weeks","sl":42}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1001":{"methods":[{"sl":71},{"sl":197},{"sl":328}],"name":"testGetMethods","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":329}]},"test_1076":{"methods":[{"sl":71},{"sl":164},{"sl":197},{"sl":328}],"name":"testFactory_standardWeeksIn_RPeriod","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":85},{"sl":86},{"sl":165},{"sl":166},{"sl":198},{"sl":329}]},"test_1157":{"methods":[{"sl":71},{"sl":298}],"name":"testToStandardSeconds","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":299}]},"test_143":{"methods":[{"sl":71},{"sl":180},{"sl":197},{"sl":225},{"sl":472}],"name":"testWeeks","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":182},{"sl":185},{"sl":186},{"sl":198},{"sl":226},{"sl":474}]},"test_144":{"methods":[{"sl":71},{"sl":197},{"sl":225}],"name":"testGetPeriodType","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":226}]},"test_1566":{"methods":[{"sl":71},{"sl":243}],"name":"testToStandardDays","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":244}]},"test_1576":{"methods":[{"sl":71},{"sl":197},{"sl":328}],"name":"testToStandardWeeks","pass":true,"statements":[{"sl":72},{"sl":75},{"sl":76},{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":85},{"sl":86},{"sl":198},{"sl":329}]},"test_1587":{"methods":[{"sl":71},{"sl":136},{"sl":197},{"sl":328}],"name":"testFactory_weeksIn_RInterval","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":79},{"sl":80},{"sl":85},{"sl":86},{"sl":137},{"sl":138},{"sl":140},{"sl":141},{"sl":198},{"sl":329}]},"test_1675":{"methods":[{"sl":71},{"sl":197},{"sl":216}],"name":"testGetFieldType","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":217}]},"test_1814":{"methods":[{"sl":71}],"name":"testToStandardWeeks","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78}]},"test_1818":{"methods":[{"sl":71},{"sl":197},{"sl":328}],"name":"testToStandardWeeks_months","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":198},{"sl":329}]},"test_182":{"methods":[{"sl":71},{"sl":197},{"sl":328},{"sl":342},{"sl":375}],"name":"testMinus_int","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":85},{"sl":86},{"sl":198},{"sl":329},{"sl":343},{"sl":344},{"sl":346},{"sl":376}]},"test_1932":{"methods":[{"sl":71},{"sl":197},{"sl":472}],"name":"testToString","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":474}]},"test_1960":{"methods":[{"sl":71},{"sl":197},{"sl":328},{"sl":342}],"name":"testPlus_int","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":85},{"sl":86},{"sl":198},{"sl":329},{"sl":343},{"sl":344},{"sl":346}]},"test_2120":{"methods":[{"sl":71},{"sl":206}],"name":"testSerialization","pass":true,"statements":[{"sl":72},{"sl":79},{"sl":80},{"sl":207}]},"test_2178":{"methods":[{"sl":71},{"sl":216}],"name":"testAddToLocalDate","pass":true,"statements":[{"sl":72},{"sl":79},{"sl":80},{"sl":217}]},"test_2224":{"methods":[{"sl":71},{"sl":197},{"sl":328},{"sl":342},{"sl":358}],"name":"testPlus_Weeks","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":85},{"sl":86},{"sl":198},{"sl":329},{"sl":343},{"sl":344},{"sl":346},{"sl":359},{"sl":360},{"sl":362}]},"test_2283":{"methods":[{"sl":71},{"sl":180},{"sl":197},{"sl":328}],"name":"testFactory_parseWeeks_String","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":85},{"sl":86},{"sl":182},{"sl":183},{"sl":185},{"sl":186},{"sl":198},{"sl":329}]},"test_2357":{"methods":[{"sl":71},{"sl":117},{"sl":197},{"sl":216},{"sl":328}],"name":"testFactory_weeksBetween_RPartial","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":79},{"sl":80},{"sl":85},{"sl":86},{"sl":118},{"sl":119},{"sl":120},{"sl":122},{"sl":124},{"sl":125},{"sl":198},{"sl":217},{"sl":329}]},"test_2362":{"methods":[{"sl":71}],"name":"testToStandardWeeks","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78}]},"test_2431":{"methods":[{"sl":71},{"sl":197},{"sl":457}],"name":"testIsLessThan","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":458},{"sl":459},{"sl":461}]},"test_2718":{"methods":[{"sl":71},{"sl":197},{"sl":328},{"sl":342},{"sl":375},{"sl":388}],"name":"testMinus_Weeks","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":85},{"sl":86},{"sl":198},{"sl":329},{"sl":343},{"sl":344},{"sl":346},{"sl":376},{"sl":389},{"sl":390},{"sl":392}]},"test_2791":{"methods":[{"sl":71},{"sl":328}],"name":"testToStandardWeeks_years","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":329}]},"test_2978":{"methods":[{"sl":71},{"sl":279}],"name":"testToStandardMinutes","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":280}]},"test_410":{"methods":[{"sl":71},{"sl":197},{"sl":444}],"name":"testIsGreaterThan","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":445},{"sl":446},{"sl":448}]},"test_458":{"methods":[{"sl":71},{"sl":197},{"sl":328},{"sl":419}],"name":"testDividedBy_int","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":85},{"sl":86},{"sl":198},{"sl":329},{"sl":420},{"sl":421},{"sl":423}]},"test_494":{"methods":[{"sl":71},{"sl":261}],"name":"testToStandardHours","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":262}]},"test_502":{"methods":[{"sl":71}],"name":"testToStandardWeeks","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78}]},"test_520":{"methods":[{"sl":71},{"sl":197},{"sl":328}],"name":"testFactory_weeks_int","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":198},{"sl":329}]},"test_523":{"methods":[{"sl":328}],"name":"testConstants","pass":true,"statements":[{"sl":329}]},"test_535":{"methods":[{"sl":71},{"sl":197},{"sl":328},{"sl":405}],"name":"testMultipliedBy_int","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":85},{"sl":86},{"sl":198},{"sl":329},{"sl":406}]},"test_669":{"methods":[{"sl":71}],"name":"testToStandardWeeks","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78}]},"test_698":{"methods":[{"sl":71},{"sl":197},{"sl":317}],"name":"testToStandardDuration","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":318},{"sl":319}]},"test_934":{"methods":[{"sl":71},{"sl":197},{"sl":328},{"sl":433}],"name":"testNegated","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":329},{"sl":434}]},"test_986":{"methods":[{"sl":71},{"sl":100},{"sl":197},{"sl":328}],"name":"testFactory_weeksBetween_RInstant","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":79},{"sl":80},{"sl":85},{"sl":86},{"sl":101},{"sl":102},{"sl":198},{"sl":329}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [182, 1818, 2283, 2718, 1001, 986, 2224, 1157, 1814, 410, 1587, 502, 2178, 1576, 1675, 669, 1076, 494, 520, 2791, 2431, 143, 144, 1960, 535, 698, 1566, 2120, 934, 2357, 2978, 458, 1932, 2362], [182, 1818, 2283, 2718, 1001, 986, 2224, 1157, 1814, 410, 1587, 502, 2178, 1576, 1675, 669, 1076, 494, 520, 2791, 2431, 143, 144, 1960, 535, 698, 1566, 2120, 934, 2357, 2978, 458, 1932, 2362], [1818, 2283, 986, 1587, 1076, 520, 2791, 2357], [1818, 2283, 986, 1587, 1076, 520, 2791, 2357], [2283, 1576, 1076, 520], [2283, 1576, 1076, 520], [182, 2283, 2718, 2224, 1157, 1814, 502, 669, 1076, 494, 520, 1960, 535, 1566, 2978, 458, 2362], [182, 2283, 2718, 2224, 1157, 1814, 502, 669, 1076, 494, 520, 1960, 535, 1566, 2978, 458, 2362], [2718, 986, 2224, 1587, 2178, 1576, 520, 2120, 2357, 458], [2718, 986, 2224, 1587, 2178, 1576, 520, 2120, 2357, 458], [1576, 520], [1576, 520], [520], [520], [182, 2283, 2718, 1001, 986, 2224, 410, 1587, 1576, 1675, 1076, 520, 2431, 143, 144, 1960, 535, 698, 934, 2357, 458, 1932], [182, 2283, 2718, 1001, 986, 2224, 410, 1587, 1576, 1675, 1076, 520, 2431, 143, 144, 1960, 535, 698, 934, 2357, 458, 1932], [], [], [], [], [], [], [], [], [], [], [], [], [], [986], [986], [986], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2357], [2357], [2357], [2357], [], [2357], [], [2357], [2357], [], [], [], [], [], [], [], [], [], [], [1587], [1587], [1587], [], [1587], [1587], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1076], [1076], [1076], [], [], [], [], [], [], [], [], [], [], [], [], [], [2283, 143], [], [2283, 143], [2283], [], [2283, 143], [2283, 143], [], [], [], [], [], [], [], [], [], [], [182, 1818, 2283, 2718, 1001, 986, 2224, 410, 1587, 1576, 1675, 1076, 520, 2431, 143, 144, 1960, 535, 698, 934, 2357, 458, 1932], [182, 1818, 2283, 2718, 1001, 986, 2224, 410, 1587, 1576, 1675, 1076, 520, 2431, 143, 144, 1960, 535, 698, 934, 2357, 458, 1932], [], [], [], [], [], [], [], [2120], [2120], [], [], [], [], [], [], [], [], [2178, 1675, 2357], [2178, 1675, 2357], [], [], [], [], [], [], [], [143, 144], [143, 144], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1566], [1566], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [494], [494], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2978], [2978], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1157], [1157], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [698], [698], [698], [], [], [], [], [], [], [], [], [182, 1818, 2283, 2718, 1001, 523, 986, 2224, 1587, 1576, 1076, 520, 2791, 1960, 535, 934, 2357, 458], [182, 1818, 2283, 2718, 1001, 523, 986, 2224, 1587, 1576, 1076, 520, 2791, 1960, 535, 934, 2357, 458], [], [], [], [], [], [], [], [], [], [], [], [], [182, 2718, 2224, 1960], [182, 2718, 2224, 1960], [182, 2718, 2224, 1960], [], [182, 2718, 2224, 1960], [], [], [], [], [], [], [], [], [], [], [], [2224], [2224], [2224], [], [2224], [], [], [], [], [], [], [], [], [], [], [], [], [182, 2718], [182, 2718], [], [], [], [], [], [], [], [], [], [], [], [2718], [2718], [2718], [], [2718], [], [], [], [], [], [], [], [], [], [], [], [], [535], [535], [], [], [], [], [], [], [], [], [], [], [], [], [458], [458], [458], [], [458], [], [], [], [], [], [], [], [], [], [934], [934], [], [], [], [], [], [], [], [], [], [410], [410], [410], [], [410], [], [], [], [], [], [], [], [], [2431], [2431], [2431], [], [2431], [], [], [], [], [], [], [], [], [], [], [143, 1932], [], [143, 1932], [], [], []]
