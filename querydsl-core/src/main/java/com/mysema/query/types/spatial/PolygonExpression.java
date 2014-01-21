/*
 * Copyright 2014, Mysema Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mysema.query.types.spatial;

import javax.annotation.Nullable;

import com.mysema.query.types.Expression;
import com.mysema.query.types.Ops;
import com.mysema.query.types.expr.NumberExpression;
import com.mysema.query.types.expr.NumberOperation;

public abstract class PolygonExpression<T> extends SurfaceExpression<T> {

    private static final long serialVersionUID = 7544382956232485312L;

    @Nullable
    private volatile NumberExpression<Integer> numInteriorRing;

    @Nullable
    private volatile LineStringExpression<?> exterorRing;

    public PolygonExpression(Expression<T> mixin) {
        super(mixin);
    }

    public LineStringExpression<?> exterorRing() {
        if (exterorRing == null) {
            // TODO
        }
        return exterorRing;
    }

    public NumberExpression<Integer> numInteriorRing() {
        if (numInteriorRing == null) {
            numInteriorRing = NumberOperation.create(Integer.class, Ops.SpatialOps.NUM_INTERIOR_RING, mixin);
        }
        return numInteriorRing;
    }

    public LineStringExpression<?> interiorRingN(int idx) {
        // TODO
        return null;
    }
}