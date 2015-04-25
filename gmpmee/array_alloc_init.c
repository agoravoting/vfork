/*

Copyright 2008 2009 Douglas Wikstr�m

This file is part of GMP Modular Exponentiation Extension (GMPMEE).

GMPMEE is free software: you can redistribute it and/or modify it
under the terms of the GNU Lesser General Public License as published
by the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

GMPMEE is distributed in the hope that it will be useful, but WITHOUT
ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public
License for more details.

You should have received a copy of the GNU Lesser General Public
License along with GMPMEE.  If not, see
<http://www.gnu.org/licenses/>.

*/

#include "gmp.h"
#include "gmpmee.h"

mpz_t *
gmpmee_array_alloc_init(size_t len) {
  int i;
  mpz_t *res = gmpmee_array_alloc(len);

  for (i = 0; i < len; i++)
    {
      mpz_init(res[i]);
    }
  return res;
}
