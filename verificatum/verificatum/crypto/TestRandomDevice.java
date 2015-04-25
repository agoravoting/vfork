
/*
 * Copyright 2008 2009 2010 Douglas Wikstrom
 *
 * This file is part of Verificatum.
 *
 * Verificatum is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * Verificatum is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Verificatum.  If not, see
 * <http://www.gnu.org/licenses/>.
 */

package verificatum.crypto;

import java.io.*;
import java.security.*;
import java.util.*;

import verificatum.arithm.*;
import verificatum.crypto.*;
import verificatum.eio.*;
import verificatum.test.*;

public class TestRandomDevice {

    public static boolean generate(TestParameters tp) throws Exception {

        RandomSource rs = new RandomDevice(new File("/dev/urandom"));

        for (int i = 0; i < 100; i++) {
            byte[] rand = rs.getBytes(tp.testSize);
        }
        return true;
    }

    public static boolean marshal(TestParameters tp)
        throws Exception {

        RandomSource rs1 = new RandomDevice(new File("/dev/urandom"));

        ByteTreeBasic bt = Marshalizer.marshal(rs1);
        RandomSource rs2 =
            Marshalizer.unmarshal_RandomSource(bt.getByteTreeReader());

        for (int i = 0; i < 1000; i++) {
            byte[] rand1 = rs1.getBytes(tp.testSize);
            byte[] rand2 = rs2.getBytes(tp.testSize);
        }
        return true;
    }

}
