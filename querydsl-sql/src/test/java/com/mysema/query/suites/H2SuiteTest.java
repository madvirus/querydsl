package com.mysema.query.suites;

import com.mysema.query.*;
import com.mysema.query.sql.H2Templates;
import org.junit.BeforeClass;

public class H2SuiteTest extends AbstractSuite {

    public static class BeanPopulation extends BeanPopulationBase {}
    public static class Delete extends DeleteBase {}
    public static class Insert extends InsertBase {}
    public static class LikeEscape extends LikeEscapeBase {}
    public static class Merge extends MergeBase {}
    public static class Select extends SelectBase {}
    public static class SelectUseLiterals extends SelectUseLiteralsBase {}
    public static class Subqueries extends SubqueriesBase {}
    public static class Types extends TypesBase {}
    public static class Union extends UnionBase {}
    public static class Update extends UpdateBase {}

    @BeforeClass
    public static void setUp() throws Exception {
        Connections.initH2();
        Connections.setTemplates(H2Templates.builder().newLineToSingleSpace().build());
    }

}
