/*

Copyright 2008 2009 Torbjörn Granlund, Douglas Wikström

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

Based on code from GNU MP Library contributed by John Amanatides and
Torbjörn Granlund.

*/

#include "gmp.h"
#include "gmpmee.h"

int
gmpmee_millerrabin_safe_trial(mpz_t n)
{
  mp_limb_t r;
  int res = 1;

  mpz_t m;

  // Check oddity.
  if (mpz_tstbit(n, 0) == 0)
    {
      res = 0;
    }
  else
    {

      mpz_init(m);
      mpz_tdiv_q_2exp (m, n, 1); /* m = (n-1)/2 */

#if __SIZEOF_INT__ == 4
#include "trialdiv_safe_32.c"
#elif __SIZEOF_INT__ == 8
#include "trialdiv_safe_64.c"
#endif

      mpz_clear(m);
    }

  return res;
}
