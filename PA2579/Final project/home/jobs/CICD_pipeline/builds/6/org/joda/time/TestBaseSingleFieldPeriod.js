var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":334,"id":22718,"methods":[{"el":35,"sc":5,"sl":33},{"el":39,"sc":5,"sl":37},{"el":43,"sc":5,"sl":41},{"el":46,"sc":5,"sl":45},{"el":49,"sc":5,"sl":48},{"el":81,"sc":5,"sl":52},{"el":134,"sc":5,"sl":83},{"el":152,"sc":5,"sl":136},{"el":165,"sc":5,"sl":155},{"el":177,"sc":5,"sl":167},{"el":189,"sc":5,"sl":179},{"el":201,"sc":5,"sl":191},{"el":229,"sc":5,"sl":204},{"el":263,"sc":5,"sl":231},{"el":270,"sc":5,"sl":266},{"el":276,"sc":5,"sl":272},{"el":295,"sc":5,"sl":290}],"name":"TestBaseSingleFieldPeriod","sl":28},{"el":332,"id":22872,"methods":[{"el":303,"sc":9,"sl":301},{"el":307,"sc":9,"sl":305},{"el":311,"sc":9,"sl":309},{"el":315,"sc":9,"sl":313},{"el":319,"sc":9,"sl":317},{"el":323,"sc":9,"sl":321},{"el":327,"sc":9,"sl":325},{"el":331,"sc":9,"sl":329}],"name":"TestBaseSingleFieldPeriod.Single","sl":299}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_11":{"methods":[{"sl":266},{"sl":301},{"sl":317},{"sl":325}],"name":"testToPeriod","pass":true,"statements":[{"sl":267},{"sl":268},{"sl":269},{"sl":302},{"sl":318},{"sl":326}]},"test_117":{"methods":[{"sl":83},{"sl":301},{"sl":309},{"sl":317}],"name":"testFactory_between_RPartial","pass":true,"statements":[{"sl":85},{"sl":86},{"sl":87},{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":101},{"sl":102},{"sl":107},{"sl":108},{"sl":113},{"sl":114},{"sl":119},{"sl":120},{"sl":125},{"sl":128},{"sl":129},{"sl":302},{"sl":310},{"sl":318}]},"test_1248":{"methods":[{"sl":290},{"sl":301},{"sl":325},{"sl":329}],"name":"testGetSetValue","pass":true,"statements":[{"sl":291},{"sl":292},{"sl":293},{"sl":294},{"sl":302},{"sl":326},{"sl":330}]},"test_2315":{"methods":[{"sl":155},{"sl":301},{"sl":325}],"name":"testValueIndexMethods","pass":true,"statements":[{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160},{"sl":302},{"sl":326}]},"test_2607":{"methods":[{"sl":167},{"sl":301},{"sl":317}],"name":"testFieldTypeIndexMethods","pass":true,"statements":[{"sl":168},{"sl":169},{"sl":170},{"sl":171},{"sl":172},{"sl":302},{"sl":318}]},"test_2707":{"methods":[{"sl":179},{"sl":301},{"sl":317}],"name":"testIsSupported","pass":true,"statements":[{"sl":180},{"sl":181},{"sl":182},{"sl":183},{"sl":184},{"sl":185},{"sl":186},{"sl":187},{"sl":188},{"sl":302},{"sl":318}]},"test_3210":{"methods":[{"sl":272},{"sl":301},{"sl":317},{"sl":325}],"name":"testToMutablePeriod","pass":true,"statements":[{"sl":273},{"sl":274},{"sl":275},{"sl":302},{"sl":318},{"sl":326}]},"test_3670":{"methods":[{"sl":191},{"sl":301},{"sl":317},{"sl":325}],"name":"testGet","pass":true,"statements":[{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":302},{"sl":318},{"sl":326}]},"test_3998":{"methods":[{"sl":204},{"sl":301},{"sl":317},{"sl":321},{"sl":325}],"name":"testEqualsHashCode","pass":true,"statements":[{"sl":205},{"sl":206},{"sl":207},{"sl":208},{"sl":209},{"sl":210},{"sl":211},{"sl":212},{"sl":213},{"sl":215},{"sl":216},{"sl":217},{"sl":218},{"sl":219},{"sl":220},{"sl":221},{"sl":223},{"sl":224},{"sl":225},{"sl":226},{"sl":227},{"sl":228},{"sl":302},{"sl":318},{"sl":322},{"sl":326}]},"test_4002":{"methods":[{"sl":136},{"sl":313}],"name":"testFactory_standardPeriodIn_RPeriod","pass":true,"statements":[{"sl":137},{"sl":138},{"sl":139},{"sl":140},{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":146},{"sl":147},{"sl":314}]},"test_535":{"methods":[{"sl":52},{"sl":305}],"name":"testFactory_between_RInstant","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":56},{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":69},{"sl":70},{"sl":75},{"sl":76},{"sl":306}]},"test_794":{"methods":[{"sl":231},{"sl":301},{"sl":325}],"name":"testCompareTo","pass":true,"statements":[{"sl":232},{"sl":233},{"sl":234},{"sl":235},{"sl":236},{"sl":237},{"sl":238},{"sl":239},{"sl":240},{"sl":241},{"sl":242},{"sl":243},{"sl":257},{"sl":258},{"sl":302},{"sl":326}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [535], [], [535], [535], [535], [], [535], [535], [535], [535], [535], [535], [535], [], [], [], [], [535], [535], [], [], [], [], [535], [535], [], [], [], [], [], [], [117], [], [117], [117], [117], [], [117], [117], [117], [117], [117], [117], [117], [117], [], [], [], [], [117], [117], [], [], [], [], [117], [117], [], [], [], [], [117], [117], [], [], [], [], [117], [117], [], [], [], [], [117], [], [], [117], [117], [], [], [], [], [], [], [4002], [4002], [4002], [4002], [4002], [4002], [4002], [4002], [4002], [4002], [4002], [4002], [], [], [], [], [], [], [], [2315], [2315], [2315], [2315], [2315], [2315], [], [], [], [], [], [], [2607], [2607], [2607], [2607], [2607], [2607], [], [], [], [], [], [], [2707], [2707], [2707], [2707], [2707], [2707], [2707], [2707], [2707], [2707], [], [], [3670], [3670], [3670], [3670], [3670], [3670], [3670], [3670], [3670], [3670], [], [], [], [3998], [3998], [3998], [3998], [3998], [3998], [3998], [3998], [3998], [3998], [], [3998], [3998], [3998], [3998], [3998], [3998], [3998], [], [3998], [3998], [3998], [3998], [3998], [3998], [], [], [794], [794], [794], [794], [794], [794], [794], [794], [794], [794], [794], [794], [794], [], [], [], [], [], [], [], [], [], [], [], [], [], [794], [794], [], [], [], [], [], [], [], [11], [11], [11], [11], [], [], [3210], [3210], [3210], [3210], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1248], [1248], [1248], [1248], [1248], [], [], [], [], [], [], [2315, 2707, 3998, 2607, 1248, 3670, 794, 11, 3210, 117], [2315, 2707, 3998, 2607, 1248, 3670, 794, 11, 3210, 117], [], [], [535], [535], [], [], [117], [117], [], [], [4002], [4002], [], [], [2707, 3998, 2607, 3670, 11, 3210, 117], [2707, 3998, 2607, 3670, 11, 3210, 117], [], [], [3998], [3998], [], [], [2315, 3998, 1248, 3670, 794, 11, 3210], [2315, 3998, 1248, 3670, 794, 11, 3210], [], [], [1248], [1248], [], [], [], []]
