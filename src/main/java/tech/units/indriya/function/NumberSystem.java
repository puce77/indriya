/*
 * Units of Measurement Reference Implementation
 * Copyright (c) 2005-2019, Units of Measurement project.
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions
 *    and the following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 * 3. Neither the name of JSR-385, Indriya nor the names of their contributors may be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package tech.units.indriya.function;

/**
 * Provides basic {@link Number} operations. 
 * <p>
 * Within a given set of {@link Number} types, supports any combination of number operations, 
 * such that any operation result is also a member of this set. 
 *  
 * @author Andi Huber
 * @since 2.0
 */
public interface NumberSystem {

    /**
     * Returns the sum of given {@code x} and {@code y} as a {@link Number} that best
     * represents the arithmetic result within the set of number types this NumberSystem
     * supports.
     * 
     * @param x
     * @param y
     * @return {@code x + y}  
     */
    Number add(Number x, Number y);
    
    /**
     * Returns the difference of given {@code x} and {@code y} as a {@link Number} that best
     * represents the arithmetic result within the set of number types this NumberSystem
     * supports.
     * 
     * @param x
     * @param y
     * @return {@code x - y}  
     */
    Number subtract(Number x, Number y);

    /**
     * Returns the product of given {@code x} and {@code y} as a {@link Number} that best
     * represents the arithmetic result within the set of number types this NumberSystem
     * supports.
     * 
     * @param x
     * @param y
     * @return {@code x * y}  
     */
    Number multiply(Number x, Number y);
    
    /**
     * Returns the division of given {@code x} and {@code y} as a {@link Number} that best
     * represents the arithmetic result within the set of number types this NumberSystem
     * supports.
     * 
     * @param x
     * @param y
     * @return {@code x / y}  
     */
    Number divide(Number x, Number y);
    
    
    /**
     * Returns the reciprocal of given {@code number} as a {@link Number} that best
     * represents the arithmetic result within the set of number types this NumberSystem
     * supports.
     * 
     * @param number
     * @return {@code number^-1}  
     */    
    Number reciprocal(Number number);
    
    /**
     * Returns the negation of given {@code number} as a {@link Number} that best
     * represents the arithmetic result within the set of number types this NumberSystem
     * supports.
     * 
     * @param number
     * @return {@code -number}  
     */    
    Number negate(Number number);
    
    /**
     * 'Narrows' given {@code number} as a {@link Number} that best
     * represents the numeric value within the set of number types this NumberSystem
     * supports.
     * <p>
     * eg. A BigInteger that is within range of Java's {@code Long} type can be narrowed to
     * Long w/o loss of precision.
     * 
     * @param number
     * @return 'best' representation of {@code number} w/o loss of precision
     */
    Number narrow(Number number);

    /**
     * Compares two {@code Number} values numerically.
     *
     * @param  x
     * @param  y
     * @return the value {@code 0} if {@code x == y};
     *         a value less than {@code 0} if {@code x < y}; and
     *         a value greater than {@code 0} if {@code x > y}
     */
    int compare(Number x, Number y);
    
    boolean isZero(Number number);
    boolean isOne(Number number);
    
    /**
     * 
     * @param x
     * @param y
     * @return
     */
    default boolean equals(Number x, Number y) {
        if(x == y) {
            return true;
        }
        if(!x.getClass().equals(y.getClass())) {
            return false;
        }
        return x.equals(y);
    }

    
    

    

}
