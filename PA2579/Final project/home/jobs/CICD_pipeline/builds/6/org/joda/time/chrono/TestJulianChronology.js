var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":320,"id":54283,"methods":[{"el":55,"sc":5,"sl":53},{"el":59,"sc":5,"sl":57},{"el":63,"sc":5,"sl":61},{"el":73,"sc":5,"sl":65},{"el":83,"sc":5,"sl":75},{"el":89,"sc":5,"sl":86},{"el":94,"sc":5,"sl":91},{"el":101,"sc":5,"sl":96},{"el":116,"sc":5,"sl":103},{"el":125,"sc":5,"sl":119},{"el":132,"sc":5,"sl":127},{"el":141,"sc":5,"sl":134},{"el":149,"sc":5,"sl":143},{"el":218,"sc":5,"sl":152},{"el":273,"sc":5,"sl":220},{"el":300,"sc":5,"sl":275},{"el":309,"sc":5,"sl":302},{"el":318,"sc":5,"sl":311}],"name":"TestJulianChronology","sl":35}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1758":{"methods":[{"sl":220}],"name":"testDateFields","pass":true,"statements":[{"sl":221},{"sl":222},{"sl":223},{"sl":224},{"sl":225},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":231},{"sl":232},{"sl":233},{"sl":235},{"sl":236},{"sl":237},{"sl":238},{"sl":239},{"sl":240},{"sl":241},{"sl":242},{"sl":243},{"sl":244},{"sl":245},{"sl":246},{"sl":248},{"sl":249},{"sl":250},{"sl":251},{"sl":252},{"sl":253},{"sl":254},{"sl":255},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":261},{"sl":262},{"sl":263},{"sl":264},{"sl":265},{"sl":266},{"sl":267},{"sl":268},{"sl":269},{"sl":270},{"sl":271},{"sl":272}]},"test_1847":{"methods":[{"sl":275}],"name":"testTimeFields","pass":true,"statements":[{"sl":276},{"sl":277},{"sl":278},{"sl":279},{"sl":280},{"sl":281},{"sl":282},{"sl":283},{"sl":284},{"sl":285},{"sl":286},{"sl":287},{"sl":289},{"sl":290},{"sl":291},{"sl":292},{"sl":293},{"sl":294},{"sl":295},{"sl":296},{"sl":297},{"sl":298},{"sl":299}]},"test_2253":{"methods":[{"sl":143}],"name":"testToString","pass":true,"statements":[{"sl":144},{"sl":145},{"sl":146},{"sl":147},{"sl":148}]},"test_2461":{"methods":[{"sl":96}],"name":"testFactory_Zone","pass":true,"statements":[{"sl":97},{"sl":98},{"sl":99},{"sl":100}]},"test_2847":{"methods":[{"sl":134}],"name":"testWithZone","pass":true,"statements":[{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":140}]},"test_2898":{"methods":[{"sl":311}],"name":"testLeap_29feb","pass":true,"statements":[{"sl":312},{"sl":313},{"sl":314},{"sl":315},{"sl":316},{"sl":317}]},"test_3184":{"methods":[{"sl":91}],"name":"testFactory","pass":true,"statements":[{"sl":92},{"sl":93}]},"test_3337":{"methods":[{"sl":86}],"name":"testFactoryUTC","pass":true,"statements":[{"sl":87},{"sl":88}]},"test_3686":{"methods":[{"sl":302}],"name":"testLeap_28feb","pass":true,"statements":[{"sl":303},{"sl":304},{"sl":305},{"sl":306},{"sl":307},{"sl":308}]},"test_3760":{"methods":[{"sl":152}],"name":"testDurationFields","pass":true,"statements":[{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160},{"sl":161},{"sl":162},{"sl":163},{"sl":164},{"sl":165},{"sl":167},{"sl":168},{"sl":169},{"sl":170},{"sl":171},{"sl":172},{"sl":173},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":180},{"sl":181},{"sl":182},{"sl":183},{"sl":184},{"sl":185},{"sl":186},{"sl":187},{"sl":188},{"sl":189},{"sl":190},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":205},{"sl":206},{"sl":207},{"sl":208},{"sl":209},{"sl":210},{"sl":211},{"sl":212},{"sl":213},{"sl":214},{"sl":215},{"sl":216},{"sl":217}]},"test_3799":{"methods":[{"sl":127}],"name":"testWithUTC","pass":true,"statements":[{"sl":128},{"sl":129},{"sl":130},{"sl":131}]},"test_434":{"methods":[{"sl":103}],"name":"testFactory_Zone_int","pass":true,"statements":[{"sl":104},{"sl":105},{"sl":106},{"sl":108},{"sl":109},{"sl":112},{"sl":113}]},"test_913":{"methods":[{"sl":119}],"name":"testEquality","pass":true,"statements":[{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3337], [3337], [3337], [], [], [3184], [3184], [3184], [], [], [2461], [2461], [2461], [2461], [2461], [], [], [434], [434], [434], [434], [], [434], [434], [], [], [434], [434], [], [], [], [], [], [913], [913], [913], [913], [913], [913], [], [], [3799], [3799], [3799], [3799], [3799], [], [], [2847], [2847], [2847], [2847], [2847], [2847], [2847], [], [], [2253], [2253], [2253], [2253], [2253], [2253], [], [], [], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [3760], [], [], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [1758], [], [], [1847], [1847], [1847], [1847], [1847], [1847], [1847], [1847], [1847], [1847], [1847], [1847], [1847], [], [1847], [1847], [1847], [1847], [1847], [1847], [1847], [1847], [1847], [1847], [1847], [], [], [3686], [3686], [3686], [3686], [3686], [3686], [3686], [], [], [2898], [2898], [2898], [2898], [2898], [2898], [2898], [], [], []]
