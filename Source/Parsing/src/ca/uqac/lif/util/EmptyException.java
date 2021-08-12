/* MIT License
 *
 * Copyright 2014-2021 Sylvain Hallé
 *
 * Laboratoire d'informatique formelle
 * Université du Québec à Chicoutimi, Canada
 *
 * Permission is hereby granted, free of charge, to any person obtaining a 
 * copy of this software and associated documentation files (the "Software"), 
 * to deal in the Software without restriction, including without limitation 
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the 
 * Software is furnished to do so, subject to the following conditions:
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to 
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *  
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 */

package ca.uqac.lif.util;

/**
 * Empty exception object.
 * @author Sylvain Hallé
 */
public class EmptyException extends Exception
{
	/**
	 * The message carried by this exception
	 */
	protected final String m_message;

	/**
	 * Dummy UID
	 */
	private static final transient long serialVersionUID = -8755602580215137730L;

	/**
	 * Creates a new empty exception
	 * @param message The message to associate this exception with
	 */
	public EmptyException(String message)
	{
		super();
		m_message = message;
	}
	
	/**
	 * Creates a new empty exception
	 * @param t A throwable object that is the cause of this exception
	 */
	public EmptyException(Throwable t)
	{
		super(t);
		m_message = "";
	}

	@Override
	public String toString()
	{
		return m_message;
	}
}
