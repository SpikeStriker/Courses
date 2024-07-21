var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":338,"id":30358,"methods":[{"el":35,"sc":5,"sl":33},{"el":39,"sc":5,"sl":37},{"el":43,"sc":5,"sl":41},{"el":87,"sc":5,"sl":45},{"el":105,"sc":5,"sl":89},{"el":191,"sc":5,"sl":107},{"el":209,"sc":5,"sl":193},{"el":226,"sc":5,"sl":211},{"el":258,"sc":5,"sl":228},{"el":303,"sc":5,"sl":260},{"el":337,"sc":5,"sl":306}],"name":"TestIllegalFieldValueException","sl":32}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1167":{"methods":[{"sl":228}],"name":"testGJCutover","pass":true,"statements":[{"sl":229},{"sl":230},{"sl":231},{"sl":234},{"sl":235},{"sl":236},{"sl":237},{"sl":238},{"sl":239},{"sl":240},{"sl":241},{"sl":244},{"sl":245},{"sl":246},{"sl":249},{"sl":250},{"sl":251},{"sl":252},{"sl":253},{"sl":254},{"sl":255},{"sl":256}]},"test_1727":{"methods":[{"sl":260}],"name":"testReadablePartialValidate","pass":true,"statements":[{"sl":262},{"sl":263},{"sl":266},{"sl":267},{"sl":268},{"sl":269},{"sl":270},{"sl":271},{"sl":272},{"sl":273},{"sl":276},{"sl":277},{"sl":280},{"sl":281},{"sl":282},{"sl":283},{"sl":284},{"sl":285},{"sl":286},{"sl":287},{"sl":290},{"sl":291},{"sl":294},{"sl":295},{"sl":296},{"sl":297},{"sl":298},{"sl":299},{"sl":300},{"sl":301}]},"test_1851":{"methods":[{"sl":45}],"name":"testVerifyValueBounds","pass":true,"statements":[{"sl":46},{"sl":47},{"sl":50},{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":60},{"sl":61},{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":74},{"sl":75},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85}]},"test_1942":{"methods":[{"sl":211}],"name":"testJulianYearZero","pass":true,"statements":[{"sl":212},{"sl":213},{"sl":214},{"sl":217},{"sl":218},{"sl":219},{"sl":220},{"sl":221},{"sl":222},{"sl":223},{"sl":224}]},"test_2372":{"methods":[{"sl":193}],"name":"testZoneTransition","pass":true,"statements":[{"sl":194},{"sl":196},{"sl":197},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":206},{"sl":207}]},"test_2748":{"methods":[{"sl":306}],"name":"testOtherConstructors","pass":true,"statements":[{"sl":307},{"sl":309},{"sl":310},{"sl":311},{"sl":312},{"sl":313},{"sl":314},{"sl":315},{"sl":316},{"sl":318},{"sl":319},{"sl":320},{"sl":321},{"sl":322},{"sl":323},{"sl":324},{"sl":325},{"sl":326},{"sl":328},{"sl":329},{"sl":330},{"sl":331},{"sl":332},{"sl":333},{"sl":334},{"sl":335},{"sl":336}]},"test_65":{"methods":[{"sl":89}],"name":"testSkipDateTimeField","pass":true,"statements":[{"sl":90},{"sl":92},{"sl":93},{"sl":96},{"sl":97},{"sl":98},{"sl":99},{"sl":100},{"sl":101},{"sl":102},{"sl":103}]},"test_722":{"methods":[{"sl":107}],"name":"testSetText","pass":true,"statements":[{"sl":108},{"sl":109},{"sl":112},{"sl":113},{"sl":114},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":122},{"sl":123},{"sl":126},{"sl":127},{"sl":128},{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":133},{"sl":136},{"sl":137},{"sl":140},{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":146},{"sl":147},{"sl":150},{"sl":151},{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160},{"sl":161},{"sl":164},{"sl":165},{"sl":168},{"sl":169},{"sl":170},{"sl":171},{"sl":172},{"sl":173},{"sl":174},{"sl":175},{"sl":178},{"sl":179},{"sl":182},{"sl":183},{"sl":184},{"sl":185},{"sl":186},{"sl":187},{"sl":188},{"sl":189}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1851], [1851], [1851], [], [], [1851], [1851], [1851], [1851], [1851], [1851], [1851], [1851], [], [], [1851], [1851], [], [], [1851], [1851], [1851], [1851], [1851], [1851], [1851], [1851], [], [], [1851], [1851], [], [], [1851], [1851], [1851], [1851], [1851], [1851], [1851], [1851], [], [], [], [65], [65], [], [65], [65], [], [], [65], [65], [65], [65], [65], [65], [65], [65], [], [], [], [722], [722], [722], [], [], [722], [722], [722], [722], [722], [722], [722], [722], [], [], [722], [722], [], [], [722], [722], [722], [722], [722], [722], [722], [722], [], [], [722], [722], [], [], [722], [722], [722], [722], [722], [722], [722], [722], [], [], [722], [722], [], [], [722], [722], [722], [722], [722], [722], [722], [722], [], [], [722], [722], [], [], [722], [722], [722], [722], [722], [722], [722], [722], [], [], [722], [722], [], [], [722], [722], [722], [722], [722], [722], [722], [722], [], [], [], [2372], [2372], [], [2372], [2372], [], [], [2372], [2372], [2372], [2372], [2372], [2372], [2372], [2372], [], [], [], [1942], [1942], [1942], [1942], [], [], [1942], [1942], [1942], [1942], [1942], [1942], [1942], [1942], [], [], [], [1167], [1167], [1167], [1167], [], [], [1167], [1167], [1167], [1167], [1167], [1167], [1167], [1167], [], [], [1167], [1167], [1167], [], [], [1167], [1167], [1167], [1167], [1167], [1167], [1167], [1167], [], [], [], [1727], [], [1727], [1727], [], [], [1727], [1727], [1727], [1727], [1727], [1727], [1727], [1727], [], [], [1727], [1727], [], [], [1727], [1727], [1727], [1727], [1727], [1727], [1727], [1727], [], [], [1727], [1727], [], [], [1727], [1727], [1727], [1727], [1727], [1727], [1727], [1727], [], [], [], [], [2748], [2748], [], [2748], [2748], [2748], [2748], [2748], [2748], [2748], [2748], [], [2748], [2748], [2748], [2748], [2748], [2748], [2748], [2748], [2748], [], [2748], [2748], [2748], [2748], [2748], [2748], [2748], [2748], [2748], [], []]
