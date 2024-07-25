var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":300,"id":29996,"methods":[{"el":67,"sc":5,"sl":65},{"el":71,"sc":5,"sl":69},{"el":75,"sc":5,"sl":73},{"el":85,"sc":5,"sl":77},{"el":95,"sc":5,"sl":87},{"el":104,"sc":5,"sl":101},{"el":110,"sc":5,"sl":107},{"el":122,"sc":5,"sl":113},{"el":134,"sc":5,"sl":125},{"el":146,"sc":5,"sl":137},{"el":158,"sc":5,"sl":149},{"el":170,"sc":5,"sl":161},{"el":180,"sc":5,"sl":173},{"el":188,"sc":5,"sl":183},{"el":196,"sc":5,"sl":191},{"el":203,"sc":5,"sl":198},{"el":210,"sc":5,"sl":205},{"el":217,"sc":5,"sl":212},{"el":226,"sc":5,"sl":223},{"el":231,"sc":5,"sl":228},{"el":241,"sc":5,"sl":233},{"el":249,"sc":5,"sl":243},{"el":257,"sc":5,"sl":251},{"el":270,"sc":5,"sl":263},{"el":279,"sc":5,"sl":272},{"el":289,"sc":5,"sl":281},{"el":299,"sc":5,"sl":291}],"name":"TestDuration_Constructors","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1077":{"methods":[{"sl":113}],"name":"testFactory_standardDays_long","pass":true,"statements":[{"sl":114},{"sl":115},{"sl":117},{"sl":118},{"sl":120},{"sl":121}]},"test_1161":{"methods":[{"sl":137}],"name":"testFactory_standardMinutes_long","pass":true,"statements":[{"sl":138},{"sl":139},{"sl":141},{"sl":142},{"sl":144},{"sl":145}]},"test_1361":{"methods":[{"sl":191}],"name":"testConstructor_RI_RI1","pass":true,"statements":[{"sl":192},{"sl":193},{"sl":194},{"sl":195}]},"test_1496":{"methods":[{"sl":161}],"name":"testFactory_millis_long","pass":true,"statements":[{"sl":162},{"sl":163},{"sl":165},{"sl":166},{"sl":168},{"sl":169}]},"test_1768":{"methods":[{"sl":263}],"name":"testConstructor_Overflow1","pass":true,"statements":[{"sl":264},{"sl":265}]},"test_1784":{"methods":[{"sl":125}],"name":"testFactory_standardHours_long","pass":true,"statements":[{"sl":126},{"sl":127},{"sl":129},{"sl":130},{"sl":132},{"sl":133}]},"test_1907":{"methods":[{"sl":223}],"name":"testConstructor_Object1","pass":true,"statements":[{"sl":224},{"sl":225}]},"test_1941":{"methods":[{"sl":198}],"name":"testConstructor_RI_RI2","pass":true,"statements":[{"sl":199},{"sl":200},{"sl":201},{"sl":202}]},"test_2002":{"methods":[{"sl":233}],"name":"testConstructor_Object3","pass":true,"statements":[{"sl":234},{"sl":238},{"sl":239},{"sl":240}]},"test_2070":{"methods":[{"sl":272}],"name":"testConstructor_Overflow2","pass":true,"statements":[{"sl":273},{"sl":274}]},"test_2103":{"methods":[{"sl":205}],"name":"testConstructor_RI_RI3","pass":true,"statements":[{"sl":206},{"sl":207},{"sl":208},{"sl":209}]},"test_2149":{"methods":[{"sl":149}],"name":"testFactory_standardSeconds_long","pass":true,"statements":[{"sl":150},{"sl":151},{"sl":153},{"sl":154},{"sl":156},{"sl":157}]},"test_2189":{"methods":[{"sl":243}],"name":"testConstructor_Object4","pass":true,"statements":[{"sl":244},{"sl":245},{"sl":246},{"sl":247},{"sl":248}]},"test_2300":{"methods":[{"sl":107}],"name":"testParse_noFormatter","pass":true,"statements":[{"sl":108},{"sl":109}]},"test_2352":{"methods":[{"sl":212}],"name":"testConstructor_RI_RI4","pass":true,"statements":[{"sl":213},{"sl":214},{"sl":215},{"sl":216}]},"test_2508":{"methods":[{"sl":101}],"name":"testZERO","pass":true,"statements":[{"sl":102},{"sl":103}]},"test_2604":{"methods":[{"sl":291}],"name":"testConstructor_Overflow4","pass":true,"statements":[{"sl":292},{"sl":293},{"sl":294}]},"test_2633":{"methods":[{"sl":281}],"name":"testConstructor_Overflow3","pass":true,"statements":[{"sl":282},{"sl":283},{"sl":284}]},"test_320":{"methods":[{"sl":251}],"name":"testConstructor_Object5","pass":true,"statements":[{"sl":252},{"sl":253},{"sl":254},{"sl":255},{"sl":256}]},"test_51":{"methods":[{"sl":173}],"name":"testConstructor_long1","pass":true,"statements":[{"sl":174},{"sl":178},{"sl":179}]},"test_588":{"methods":[{"sl":183}],"name":"testConstructor_long_long1","pass":true,"statements":[{"sl":184},{"sl":185},{"sl":186},{"sl":187}]},"test_670":{"methods":[{"sl":228}],"name":"testConstructor_Object2","pass":true,"statements":[{"sl":229},{"sl":230}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2508], [2508], [2508], [], [], [], [2300], [2300], [2300], [], [], [], [1077], [1077], [1077], [], [1077], [1077], [], [1077], [1077], [], [], [], [1784], [1784], [1784], [], [1784], [1784], [], [1784], [1784], [], [], [], [1161], [1161], [1161], [], [1161], [1161], [], [1161], [1161], [], [], [], [2149], [2149], [2149], [], [2149], [2149], [], [2149], [2149], [], [], [], [1496], [1496], [1496], [], [1496], [1496], [], [1496], [1496], [], [], [], [51], [51], [], [], [], [51], [51], [], [], [], [588], [588], [588], [588], [588], [], [], [], [1361], [1361], [1361], [1361], [1361], [], [], [1941], [1941], [1941], [1941], [1941], [], [], [2103], [2103], [2103], [2103], [2103], [], [], [2352], [2352], [2352], [2352], [2352], [], [], [], [], [], [], [1907], [1907], [1907], [], [], [670], [670], [670], [], [], [2002], [2002], [], [], [], [2002], [2002], [2002], [], [], [2189], [2189], [2189], [2189], [2189], [2189], [], [], [320], [320], [320], [320], [320], [320], [], [], [], [], [], [], [1768], [1768], [1768], [], [], [], [], [], [], [2070], [2070], [2070], [], [], [], [], [], [], [2633], [2633], [2633], [2633], [], [], [], [], [], [], [2604], [2604], [2604], [2604], [], [], [], [], [], []]
