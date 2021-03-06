package com.mysema.query.jpa.domain.sql;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;

import com.mysema.query.sql.ColumnMetadata;


/**
 * SOrder is a Querydsl query type for SOrder
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class SOrder extends com.mysema.query.sql.RelationalPathBase<SOrder> {

    private static final long serialVersionUID = 739361538;

    public static final SOrder order_ = new SOrder("order_");

    public final NumberPath<Integer> customerId = createNumber("customerId", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath paid = createBoolean("paid");

    public final com.mysema.query.sql.PrimaryKey<SOrder> primary = createPrimaryKey(id);

    public final com.mysema.query.sql.ForeignKey<SCustomer> fkc3df62d1b29c27bc = createForeignKey(customerId, "id");

    public final com.mysema.query.sql.ForeignKey<SOrder_item> _fk1b5e8cbeb968f515 = createInvForeignKey(id, "order__id");

    public final com.mysema.query.sql.ForeignKey<SCustomer> _fk600e7c419cc457f1 = createInvForeignKey(id, "currentOrder_id");

    public final com.mysema.query.sql.ForeignKey<SOrderDeliveredItemIndices> _fk30cbd6611a4d2378 = createInvForeignKey(id, "Order_id");

    public final com.mysema.query.sql.ForeignKey<SLineItems> _fkb2e400cb968f515 = createInvForeignKey(id, "order__id");

    public SOrder(String variable) {
        super(SOrder.class, forVariable(variable), "null", "order_");
        addMetadata();
    }

    public SOrder(String variable, String schema, String table) {
        super(SOrder.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SOrder(Path<? extends SOrder> path) {
        super(path.getType(), path.getMetadata(), "null", "order_");
        addMetadata();
    }

    public SOrder(PathMetadata<?> metadata) {
        super(SOrder.class, metadata, "null", "order_");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(customerId, ColumnMetadata.named("customer_id").withIndex(3).ofType(4).withSize(10));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(-5).withSize(19).notNull());
        addMetadata(paid, ColumnMetadata.named("paid").withIndex(2).ofType(-7).notNull());
    }

}

