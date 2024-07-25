var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":755,"id":39199,"methods":[{"el":83,"sc":5,"sl":81},{"el":87,"sc":5,"sl":85},{"el":91,"sc":5,"sl":89},{"el":101,"sc":5,"sl":93},{"el":111,"sc":5,"sl":103},{"el":118,"sc":5,"sl":114},{"el":149,"sc":5,"sl":121},{"el":179,"sc":5,"sl":151},{"el":206,"sc":5,"sl":181},{"el":249,"sc":5,"sl":208},{"el":310,"sc":5,"sl":282},{"el":335,"sc":5,"sl":312},{"el":360,"sc":5,"sl":337},{"el":385,"sc":5,"sl":362},{"el":403,"sc":5,"sl":388},{"el":412,"sc":5,"sl":406},{"el":418,"sc":5,"sl":414},{"el":427,"sc":5,"sl":420},{"el":433,"sc":5,"sl":429},{"el":440,"sc":5,"sl":436},{"el":447,"sc":5,"sl":442},{"el":456,"sc":5,"sl":449},{"el":485,"sc":5,"sl":458},{"el":507,"sc":5,"sl":487},{"el":515,"sc":5,"sl":509},{"el":525,"sc":5,"sl":517},{"el":551,"sc":5,"sl":527},{"el":577,"sc":5,"sl":553},{"el":583,"sc":5,"sl":579},{"el":600,"sc":5,"sl":585},{"el":612,"sc":5,"sl":602},{"el":619,"sc":5,"sl":614},{"el":626,"sc":5,"sl":621},{"el":634,"sc":5,"sl":628},{"el":642,"sc":5,"sl":636},{"el":654,"sc":5,"sl":644},{"el":666,"sc":5,"sl":656},{"el":682,"sc":5,"sl":668},{"el":690,"sc":5,"sl":684},{"el":698,"sc":5,"sl":692},{"el":724,"sc":5,"sl":700},{"el":737,"sc":13,"sl":735},{"el":740,"sc":13,"sl":738},{"el":743,"sc":13,"sl":741},{"el":753,"sc":5,"sl":727}],"name":"TestMutableDateTime_Basics","sl":45},{"el":261,"id":39339,"methods":[{"el":254,"sc":9,"sl":252},{"el":257,"sc":9,"sl":255},{"el":260,"sc":9,"sl":258}],"name":"TestMutableDateTime_Basics.MockInstant","sl":251},{"el":280,"id":39345,"methods":[{"el":267,"sc":9,"sl":265},{"el":270,"sc":9,"sl":268},{"el":273,"sc":9,"sl":271},{"el":276,"sc":9,"sl":274},{"el":279,"sc":9,"sl":277}],"name":"TestMutableDateTime_Basics.MockEqualsChronology","sl":263}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1179":{"methods":[{"sl":553}],"name":"testToMutableDateTime_Chronology","pass":true,"statements":[{"sl":554},{"sl":555},{"sl":556},{"sl":557},{"sl":558},{"sl":560},{"sl":561},{"sl":562},{"sl":563},{"sl":564},{"sl":566},{"sl":567},{"sl":568},{"sl":569},{"sl":570},{"sl":572},{"sl":573},{"sl":574},{"sl":575},{"sl":576}]},"test_118":{"methods":[{"sl":414}],"name":"testToString_String","pass":true,"statements":[{"sl":415},{"sl":416},{"sl":417}]},"test_1237":{"methods":[{"sl":388}],"name":"testSerialization","pass":true,"statements":[{"sl":389},{"sl":391},{"sl":392},{"sl":393},{"sl":394},{"sl":395},{"sl":397},{"sl":398},{"sl":399},{"sl":400},{"sl":402}]},"test_125":{"methods":[{"sl":585}],"name":"testToCalendar_Locale","pass":true,"statements":[{"sl":586},{"sl":587},{"sl":588},{"sl":589},{"sl":591},{"sl":592},{"sl":593},{"sl":594},{"sl":596},{"sl":597},{"sl":598},{"sl":599}]},"test_1435":{"methods":[{"sl":255},{"sl":312}],"name":"testIsEqual","pass":true,"statements":[{"sl":256},{"sl":313},{"sl":314},{"sl":315},{"sl":316},{"sl":317},{"sl":318},{"sl":320},{"sl":321},{"sl":322},{"sl":324},{"sl":325},{"sl":326},{"sl":327},{"sl":329},{"sl":330},{"sl":332},{"sl":333},{"sl":334}]},"test_1475":{"methods":[{"sl":442}],"name":"testToDateTime","pass":true,"statements":[{"sl":443},{"sl":444},{"sl":445},{"sl":446}]},"test_1488":{"methods":[{"sl":458}],"name":"testToDateTime_DateTimeZone","pass":true,"statements":[{"sl":459},{"sl":460},{"sl":461},{"sl":462},{"sl":463},{"sl":465},{"sl":466},{"sl":467},{"sl":468},{"sl":470},{"sl":471},{"sl":472},{"sl":473},{"sl":475},{"sl":476},{"sl":477},{"sl":478},{"sl":480},{"sl":481},{"sl":482},{"sl":483},{"sl":484}]},"test_1541":{"methods":[{"sl":255},{"sl":282}],"name":"testCompareTo","pass":true,"statements":[{"sl":256},{"sl":283},{"sl":284},{"sl":285},{"sl":286},{"sl":287},{"sl":288},{"sl":290},{"sl":291},{"sl":292},{"sl":294},{"sl":295},{"sl":296},{"sl":297},{"sl":299},{"sl":300},{"sl":302},{"sl":303}]},"test_1546":{"methods":[{"sl":579}],"name":"testToDate","pass":true,"statements":[{"sl":580},{"sl":581},{"sl":582}]},"test_1550":{"methods":[{"sl":656}],"name":"testRounding4","pass":true,"statements":[{"sl":657},{"sl":658},{"sl":659},{"sl":660},{"sl":661},{"sl":663},{"sl":664},{"sl":665}]},"test_1581":{"methods":[{"sl":449}],"name":"testToDateTimeISO","pass":true,"statements":[{"sl":450},{"sl":451},{"sl":452},{"sl":453},{"sl":454},{"sl":455}]},"test_1639":{"methods":[{"sl":517}],"name":"testToMutableDateTimeISO","pass":true,"statements":[{"sl":518},{"sl":519},{"sl":520},{"sl":521},{"sl":522},{"sl":523},{"sl":524}]},"test_1646":{"methods":[{"sl":727},{"sl":735},{"sl":741}],"name":"testProperty","pass":true,"statements":[{"sl":728},{"sl":729},{"sl":730},{"sl":731},{"sl":732},{"sl":733},{"sl":736},{"sl":742},{"sl":745},{"sl":746},{"sl":749},{"sl":750}]},"test_1648":{"methods":[{"sl":121}],"name":"testGet_DateTimeField","pass":true,"statements":[{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126},{"sl":127},{"sl":128},{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":140},{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":146}]},"test_1649":{"methods":[{"sl":527}],"name":"testToMutableDateTime_DateTimeZone","pass":true,"statements":[{"sl":528},{"sl":529},{"sl":530},{"sl":531},{"sl":532},{"sl":534},{"sl":535},{"sl":536},{"sl":537},{"sl":538},{"sl":540},{"sl":541},{"sl":542},{"sl":543},{"sl":544},{"sl":546},{"sl":547},{"sl":548},{"sl":549},{"sl":550}]},"test_1704":{"methods":[{"sl":151}],"name":"testGet_DateTimeFieldType","pass":true,"statements":[{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160},{"sl":161},{"sl":162},{"sl":163},{"sl":164},{"sl":165},{"sl":166},{"sl":167},{"sl":168},{"sl":169},{"sl":170},{"sl":171},{"sl":172},{"sl":173},{"sl":174},{"sl":175},{"sl":176}]},"test_1738":{"methods":[{"sl":406}],"name":"testToString","pass":true,"statements":[{"sl":407},{"sl":408},{"sl":410},{"sl":411}]},"test_1778":{"methods":[{"sl":614}],"name":"testClone","pass":true,"statements":[{"sl":615},{"sl":616},{"sl":617},{"sl":618}]},"test_1789":{"methods":[{"sl":429}],"name":"testToString_DTFormatter","pass":true,"statements":[{"sl":430},{"sl":431},{"sl":432}]},"test_1812":{"methods":[{"sl":208},{"sl":255},{"sl":258},{"sl":265}],"name":"testEqualsHashCode","pass":true,"statements":[{"sl":209},{"sl":210},{"sl":211},{"sl":212},{"sl":213},{"sl":214},{"sl":215},{"sl":216},{"sl":217},{"sl":219},{"sl":220},{"sl":221},{"sl":222},{"sl":223},{"sl":224},{"sl":225},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":231},{"sl":232},{"sl":233},{"sl":235},{"sl":236},{"sl":237},{"sl":238},{"sl":239},{"sl":240},{"sl":241},{"sl":242},{"sl":244},{"sl":245},{"sl":246},{"sl":247},{"sl":248},{"sl":256},{"sl":259},{"sl":266}]},"test_1863":{"methods":[{"sl":114}],"name":"testTest","pass":true,"statements":[{"sl":115},{"sl":116},{"sl":117}]},"test_2088":{"methods":[{"sl":487}],"name":"testToDateTime_Chronology","pass":true,"statements":[{"sl":488},{"sl":489},{"sl":490},{"sl":491},{"sl":493},{"sl":494},{"sl":495},{"sl":496},{"sl":498},{"sl":499},{"sl":500},{"sl":501},{"sl":503},{"sl":504},{"sl":505},{"sl":506}]},"test_223":{"methods":[{"sl":602}],"name":"testToGregorianCalendar","pass":true,"statements":[{"sl":603},{"sl":604},{"sl":605},{"sl":606},{"sl":608},{"sl":609},{"sl":610},{"sl":611}]},"test_2282":{"methods":[{"sl":644}],"name":"testRounding3","pass":true,"statements":[{"sl":645},{"sl":646},{"sl":647},{"sl":648},{"sl":649},{"sl":651},{"sl":652},{"sl":653}]},"test_249":{"methods":[{"sl":420}],"name":"testToString_String_String","pass":true,"statements":[{"sl":421},{"sl":422},{"sl":423},{"sl":424},{"sl":425},{"sl":426}]},"test_2497":{"methods":[{"sl":255},{"sl":337}],"name":"testIsBefore","pass":true,"statements":[{"sl":256},{"sl":338},{"sl":339},{"sl":340},{"sl":341},{"sl":342},{"sl":343},{"sl":345},{"sl":346},{"sl":347},{"sl":349},{"sl":350},{"sl":351},{"sl":352},{"sl":354},{"sl":355},{"sl":357},{"sl":358},{"sl":359}]},"test_2539":{"methods":[{"sl":668}],"name":"testRounding5","pass":true,"statements":[{"sl":669},{"sl":670},{"sl":671},{"sl":672},{"sl":673},{"sl":675},{"sl":676},{"sl":677},{"sl":679},{"sl":680},{"sl":681}]},"test_2600":{"methods":[{"sl":700}],"name":"testRounding8","pass":true,"statements":[{"sl":701},{"sl":702},{"sl":703},{"sl":705},{"sl":706},{"sl":707},{"sl":709},{"sl":710},{"sl":711},{"sl":713},{"sl":714},{"sl":715},{"sl":717},{"sl":718},{"sl":719},{"sl":721},{"sl":722},{"sl":723}]},"test_2743":{"methods":[{"sl":436}],"name":"testToInstant","pass":true,"statements":[{"sl":437},{"sl":438},{"sl":439}]},"test_4":{"methods":[{"sl":181}],"name":"testGetMethods","pass":true,"statements":[{"sl":182},{"sl":184},{"sl":185},{"sl":186},{"sl":188},{"sl":189},{"sl":190},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205}]},"test_621":{"methods":[{"sl":621}],"name":"testCopy","pass":true,"statements":[{"sl":622},{"sl":623},{"sl":624},{"sl":625}]},"test_642":{"methods":[{"sl":692}],"name":"testRounding7","pass":true,"statements":[{"sl":693},{"sl":694},{"sl":695}]},"test_718":{"methods":[{"sl":636}],"name":"testRounding2","pass":true,"statements":[{"sl":637},{"sl":638},{"sl":639},{"sl":640},{"sl":641}]},"test_738":{"methods":[{"sl":628}],"name":"testRounding1","pass":true,"statements":[{"sl":629},{"sl":630},{"sl":631},{"sl":632},{"sl":633}]},"test_892":{"methods":[{"sl":255},{"sl":362}],"name":"testIsAfter","pass":true,"statements":[{"sl":256},{"sl":363},{"sl":364},{"sl":365},{"sl":366},{"sl":367},{"sl":368},{"sl":370},{"sl":371},{"sl":372},{"sl":374},{"sl":375},{"sl":376},{"sl":377},{"sl":379},{"sl":380},{"sl":382},{"sl":383},{"sl":384}]},"test_927":{"methods":[{"sl":509}],"name":"testToMutableDateTime","pass":true,"statements":[{"sl":510},{"sl":511},{"sl":512},{"sl":513},{"sl":514}]},"test_971":{"methods":[{"sl":684}],"name":"testRounding6","pass":true,"statements":[{"sl":685},{"sl":686},{"sl":687},{"sl":688},{"sl":689}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1863], [1863], [1863], [1863], [], [], [], [1648], [1648], [1648], [1648], [1648], [1648], [1648], [1648], [1648], [1648], [1648], [1648], [1648], [1648], [1648], [1648], [1648], [1648], [1648], [1648], [1648], [1648], [1648], [1648], [1648], [1648], [], [], [], [], [1704], [1704], [1704], [1704], [1704], [1704], [1704], [1704], [1704], [1704], [1704], [1704], [1704], [1704], [1704], [1704], [1704], [1704], [1704], [1704], [1704], [1704], [1704], [1704], [1704], [1704], [], [], [], [], [4], [4], [], [4], [4], [4], [], [4], [4], [4], [4], [4], [4], [4], [4], [4], [4], [4], [4], [4], [4], [4], [4], [4], [4], [], [], [1812], [1812], [1812], [1812], [1812], [1812], [1812], [1812], [1812], [1812], [], [1812], [1812], [1812], [1812], [1812], [1812], [1812], [], [1812], [1812], [1812], [1812], [1812], [1812], [1812], [], [1812], [1812], [1812], [1812], [1812], [1812], [1812], [1812], [], [1812], [1812], [1812], [1812], [1812], [], [], [], [], [], [], [1435, 892, 1812, 1541, 2497], [1435, 892, 1812, 1541, 2497], [], [1812], [1812], [], [], [], [], [], [1812], [1812], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1541], [1541], [1541], [1541], [1541], [1541], [1541], [], [1541], [1541], [1541], [], [1541], [1541], [1541], [1541], [], [1541], [1541], [], [1541], [1541], [], [], [], [], [], [], [], [], [1435], [1435], [1435], [1435], [1435], [1435], [1435], [], [1435], [1435], [1435], [], [1435], [1435], [1435], [1435], [], [1435], [1435], [], [1435], [1435], [1435], [], [], [2497], [2497], [2497], [2497], [2497], [2497], [2497], [], [2497], [2497], [2497], [], [2497], [2497], [2497], [2497], [], [2497], [2497], [], [2497], [2497], [2497], [], [], [892], [892], [892], [892], [892], [892], [892], [], [892], [892], [892], [], [892], [892], [892], [892], [], [892], [892], [], [892], [892], [892], [], [], [], [1237], [1237], [], [1237], [1237], [1237], [1237], [1237], [], [1237], [1237], [1237], [1237], [], [1237], [], [], [], [1738], [1738], [1738], [], [1738], [1738], [], [], [118], [118], [118], [118], [], [], [249], [249], [249], [249], [249], [249], [249], [], [], [1789], [1789], [1789], [1789], [], [], [], [2743], [2743], [2743], [2743], [], [], [1475], [1475], [1475], [1475], [1475], [], [], [1581], [1581], [1581], [1581], [1581], [1581], [1581], [], [], [1488], [1488], [1488], [1488], [1488], [1488], [], [1488], [1488], [1488], [1488], [], [1488], [1488], [1488], [1488], [], [1488], [1488], [1488], [1488], [], [1488], [1488], [1488], [1488], [1488], [], [], [2088], [2088], [2088], [2088], [2088], [], [2088], [2088], [2088], [2088], [], [2088], [2088], [2088], [2088], [], [2088], [2088], [2088], [2088], [], [], [927], [927], [927], [927], [927], [927], [], [], [1639], [1639], [1639], [1639], [1639], [1639], [1639], [1639], [], [], [1649], [1649], [1649], [1649], [1649], [1649], [], [1649], [1649], [1649], [1649], [1649], [], [1649], [1649], [1649], [1649], [1649], [], [1649], [1649], [1649], [1649], [1649], [], [], [1179], [1179], [1179], [1179], [1179], [1179], [], [1179], [1179], [1179], [1179], [1179], [], [1179], [1179], [1179], [1179], [1179], [], [1179], [1179], [1179], [1179], [1179], [], [], [1546], [1546], [1546], [1546], [], [], [125], [125], [125], [125], [125], [], [125], [125], [125], [125], [], [125], [125], [125], [125], [], [], [223], [223], [223], [223], [223], [], [223], [223], [223], [223], [], [], [1778], [1778], [1778], [1778], [1778], [], [], [621], [621], [621], [621], [621], [], [], [738], [738], [738], [738], [738], [738], [], [], [718], [718], [718], [718], [718], [718], [], [], [2282], [2282], [2282], [2282], [2282], [2282], [], [2282], [2282], [2282], [], [], [1550], [1550], [1550], [1550], [1550], [1550], [], [1550], [1550], [1550], [], [], [2539], [2539], [2539], [2539], [2539], [2539], [], [2539], [2539], [2539], [], [2539], [2539], [2539], [], [], [971], [971], [971], [971], [971], [971], [], [], [642], [642], [642], [642], [], [], [], [], [2600], [2600], [2600], [2600], [], [2600], [2600], [2600], [], [2600], [2600], [2600], [], [2600], [2600], [2600], [], [2600], [2600], [2600], [], [2600], [2600], [2600], [], [], [], [1646], [1646], [1646], [1646], [1646], [1646], [1646], [], [1646], [1646], [], [], [], [], [1646], [1646], [], [], [1646], [1646], [], [], [1646], [1646], [], [], [], [], []]
