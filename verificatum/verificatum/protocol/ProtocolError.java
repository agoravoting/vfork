
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

package verificatum.protocol;

/**
 * Thrown when a fatal error occurs.
 *
 * @author Douglas Wikstrom
 */
public class ProtocolError extends Error {

    /**
     * Constructs a new error with the specified detail message.
     *
     * @param message Detailed message of the problem.
     */
    public ProtocolError(String message) {
        super(message);
    }

    /**
     * Constructs a new error with the specified detail message
     * and cause.
     *
     * @param message Detailed message of the problem.
     * @param cause What caused this error to be thrown.
     */
    public ProtocolError(String message, Throwable cause) {
        super(message, cause);
    }
}
