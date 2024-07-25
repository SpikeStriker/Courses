var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":489,"id":40920,"methods":[{"el":77,"sc":5,"sl":75},{"el":81,"sc":5,"sl":79},{"el":85,"sc":5,"sl":83},{"el":95,"sc":5,"sl":87},{"el":105,"sc":5,"sl":97},{"el":112,"sc":5,"sl":108},{"el":123,"sc":5,"sl":115},{"el":129,"sc":5,"sl":125},{"el":134,"sc":5,"sl":131},{"el":178,"sc":5,"sl":136},{"el":203,"sc":5,"sl":196},{"el":218,"sc":5,"sl":205},{"el":228,"sc":5,"sl":220},{"el":261,"sc":5,"sl":231},{"el":295,"sc":5,"sl":263},{"el":308,"sc":5,"sl":298},{"el":319,"sc":5,"sl":310},{"el":333,"sc":5,"sl":321},{"el":347,"sc":5,"sl":335},{"el":360,"sc":5,"sl":350},{"el":371,"sc":5,"sl":362},{"el":385,"sc":5,"sl":373},{"el":399,"sc":5,"sl":387},{"el":406,"sc":5,"sl":402},{"el":414,"sc":5,"sl":409},{"el":425,"sc":5,"sl":417},{"el":436,"sc":5,"sl":428},{"el":446,"sc":5,"sl":438},{"el":464,"sc":5,"sl":449},{"el":472,"sc":5,"sl":467},{"el":480,"sc":5,"sl":475},{"el":486,"sc":5,"sl":481}],"name":"TestMutableInterval_Basics","sl":38},{"el":193,"id":40999,"methods":[{"el":183,"sc":9,"sl":181},{"el":186,"sc":9,"sl":184},{"el":189,"sc":9,"sl":187},{"el":192,"sc":9,"sl":190}],"name":"TestMutableInterval_Basics.MockInterval","sl":180}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":417}],"name":"testToPeriod","pass":true,"statements":[{"sl":418},{"sl":419},{"sl":420},{"sl":422},{"sl":423},{"sl":424}]},"test_1033":{"methods":[{"sl":205}],"name":"testContainsNow","pass":true,"statements":[{"sl":206},{"sl":208},{"sl":209},{"sl":210},{"sl":211},{"sl":212},{"sl":213},{"sl":214},{"sl":215},{"sl":216},{"sl":217}]},"test_1241":{"methods":[{"sl":362}],"name":"testIsAfterNow","pass":true,"statements":[{"sl":363},{"sl":365},{"sl":366},{"sl":367},{"sl":368},{"sl":369},{"sl":370}]},"test_1304":{"methods":[{"sl":409}],"name":"testToMutableInterval1","pass":true,"statements":[{"sl":410},{"sl":411},{"sl":412},{"sl":413}]},"test_1616":{"methods":[{"sl":350}],"name":"testIsAfter_long","pass":true,"statements":[{"sl":351},{"sl":353},{"sl":354},{"sl":355},{"sl":357},{"sl":358},{"sl":359}]},"test_1676":{"methods":[{"sl":475}],"name":"testCopy","pass":true,"statements":[{"sl":476},{"sl":477},{"sl":478},{"sl":479}]},"test_1721":{"methods":[{"sl":428}],"name":"testToPeriod_PeriodType1","pass":true,"statements":[{"sl":429},{"sl":430},{"sl":431},{"sl":433},{"sl":434},{"sl":435}]},"test_1826":{"methods":[{"sl":387}],"name":"testIsAfter_RInterval","pass":true,"statements":[{"sl":388},{"sl":390},{"sl":391},{"sl":392},{"sl":394},{"sl":395},{"sl":396},{"sl":398}]},"test_1900":{"methods":[{"sl":310}],"name":"testIsBeforeNow","pass":true,"statements":[{"sl":311},{"sl":313},{"sl":314},{"sl":315},{"sl":316},{"sl":317},{"sl":318}]},"test_2027":{"methods":[{"sl":125}],"name":"testGetDuration1","pass":true,"statements":[{"sl":126},{"sl":127},{"sl":128}]},"test_2140":{"methods":[{"sl":263}],"name":"testOverlaps_RInterval","pass":true,"statements":[{"sl":264},{"sl":266},{"sl":267},{"sl":269},{"sl":270},{"sl":271},{"sl":273},{"sl":274},{"sl":275},{"sl":276},{"sl":277},{"sl":279},{"sl":280},{"sl":281},{"sl":282},{"sl":283},{"sl":285},{"sl":286},{"sl":287},{"sl":289},{"sl":291},{"sl":292},{"sl":293},{"sl":294}]},"test_2226":{"methods":[{"sl":220}],"name":"testContains_RI","pass":true,"statements":[{"sl":221},{"sl":222},{"sl":223},{"sl":224},{"sl":225},{"sl":226},{"sl":227}]},"test_2292":{"methods":[{"sl":467}],"name":"testToString","pass":true,"statements":[{"sl":468},{"sl":469},{"sl":470},{"sl":471}]},"test_2329":{"methods":[{"sl":115}],"name":"testGetMillis","pass":true,"statements":[{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122}]},"test_2590":{"methods":[{"sl":136},{"sl":181},{"sl":184},{"sl":187},{"sl":190}],"name":"testEqualsHashCode","pass":true,"statements":[{"sl":137},{"sl":138},{"sl":139},{"sl":140},{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":151},{"sl":152},{"sl":153},{"sl":155},{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160},{"sl":161},{"sl":162},{"sl":164},{"sl":165},{"sl":166},{"sl":167},{"sl":168},{"sl":169},{"sl":170},{"sl":171},{"sl":172},{"sl":173},{"sl":175},{"sl":176},{"sl":177},{"sl":182},{"sl":185},{"sl":188},{"sl":191}]},"test_2606":{"methods":[{"sl":481}],"name":"testClone","pass":true,"statements":[{"sl":482},{"sl":483},{"sl":484},{"sl":485}]},"test_2938":{"methods":[{"sl":196}],"name":"testContains_long","pass":true,"statements":[{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":201},{"sl":202}]},"test_2954":{"methods":[{"sl":108}],"name":"testTest","pass":true,"statements":[{"sl":109},{"sl":110},{"sl":111}]},"test_312":{"methods":[{"sl":131}],"name":"testGetDuration2","pass":true,"statements":[{"sl":132},{"sl":133}]},"test_32":{"methods":[{"sl":402}],"name":"testToInterval1","pass":true,"statements":[{"sl":403},{"sl":404},{"sl":405}]},"test_368":{"methods":[{"sl":335}],"name":"testIsBefore_RInterval","pass":true,"statements":[{"sl":336},{"sl":338},{"sl":339},{"sl":340},{"sl":342},{"sl":343},{"sl":344},{"sl":346}]},"test_577":{"methods":[{"sl":231}],"name":"testContains_RInterval","pass":true,"statements":[{"sl":232},{"sl":234},{"sl":235},{"sl":237},{"sl":238},{"sl":239},{"sl":241},{"sl":242},{"sl":243},{"sl":244},{"sl":245},{"sl":247},{"sl":248},{"sl":249},{"sl":250},{"sl":251},{"sl":253},{"sl":254},{"sl":255},{"sl":256},{"sl":257},{"sl":258},{"sl":260}]},"test_649":{"methods":[{"sl":321}],"name":"testIsBefore_RI","pass":true,"statements":[{"sl":322},{"sl":324},{"sl":325},{"sl":326},{"sl":328},{"sl":329},{"sl":330},{"sl":332}]},"test_762":{"methods":[{"sl":298}],"name":"testIsBefore_long","pass":true,"statements":[{"sl":299},{"sl":301},{"sl":302},{"sl":303},{"sl":305},{"sl":306},{"sl":307}]},"test_763":{"methods":[{"sl":449}],"name":"testSerialization","pass":true,"statements":[{"sl":450},{"sl":452},{"sl":453},{"sl":454},{"sl":455},{"sl":456},{"sl":458},{"sl":459},{"sl":460},{"sl":461},{"sl":463}]},"test_81":{"methods":[{"sl":373}],"name":"testIsAfter_RI","pass":true,"statements":[{"sl":374},{"sl":376},{"sl":377},{"sl":378},{"sl":380},{"sl":381},{"sl":382},{"sl":384}]},"test_897":{"methods":[{"sl":438}],"name":"testToPeriod_PeriodType2","pass":true,"statements":[{"sl":439},{"sl":440},{"sl":441},{"sl":443},{"sl":444},{"sl":445}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2954], [2954], [2954], [2954], [], [], [], [2329], [2329], [2329], [2329], [2329], [2329], [2329], [2329], [], [], [2027], [2027], [2027], [2027], [], [], [312], [312], [312], [], [], [2590], [2590], [2590], [2590], [2590], [2590], [2590], [2590], [2590], [2590], [], [2590], [2590], [2590], [2590], [2590], [2590], [2590], [], [2590], [2590], [2590], [2590], [2590], [2590], [2590], [2590], [], [2590], [2590], [2590], [2590], [2590], [2590], [2590], [2590], [2590], [2590], [], [2590], [2590], [2590], [], [], [], [2590], [2590], [], [2590], [2590], [], [2590], [2590], [], [2590], [2590], [], [], [], [], [2938], [2938], [2938], [2938], [2938], [2938], [2938], [], [], [1033], [1033], [], [1033], [1033], [1033], [1033], [1033], [1033], [1033], [1033], [1033], [1033], [], [], [2226], [2226], [2226], [2226], [2226], [2226], [2226], [2226], [], [], [], [577], [577], [], [577], [577], [], [577], [577], [577], [], [577], [577], [577], [577], [577], [], [577], [577], [577], [577], [577], [], [577], [577], [577], [577], [577], [577], [], [577], [], [], [2140], [2140], [], [2140], [2140], [], [2140], [2140], [2140], [], [2140], [2140], [2140], [2140], [2140], [], [2140], [2140], [2140], [2140], [2140], [], [2140], [2140], [2140], [], [2140], [], [2140], [2140], [2140], [2140], [], [], [], [762], [762], [], [762], [762], [762], [], [762], [762], [762], [], [], [1900], [1900], [], [1900], [1900], [1900], [1900], [1900], [1900], [], [], [649], [649], [], [649], [649], [649], [], [649], [649], [649], [], [649], [], [], [368], [368], [], [368], [368], [368], [], [368], [368], [368], [], [368], [], [], [], [1616], [1616], [], [1616], [1616], [1616], [], [1616], [1616], [1616], [], [], [1241], [1241], [], [1241], [1241], [1241], [1241], [1241], [1241], [], [], [81], [81], [], [81], [81], [81], [], [81], [81], [81], [], [81], [], [], [1826], [1826], [], [1826], [1826], [1826], [], [1826], [1826], [1826], [], [1826], [], [], [], [32], [32], [32], [32], [], [], [], [1304], [1304], [1304], [1304], [1304], [], [], [], [1], [1], [1], [1], [], [1], [1], [1], [], [], [], [1721], [1721], [1721], [1721], [], [1721], [1721], [1721], [], [], [897], [897], [897], [897], [], [897], [897], [897], [], [], [], [763], [763], [], [763], [763], [763], [763], [763], [], [763], [763], [763], [763], [], [763], [], [], [], [2292], [2292], [2292], [2292], [2292], [], [], [], [1676], [1676], [1676], [1676], [1676], [], [2606], [2606], [2606], [2606], [2606], [], [], [], []]
