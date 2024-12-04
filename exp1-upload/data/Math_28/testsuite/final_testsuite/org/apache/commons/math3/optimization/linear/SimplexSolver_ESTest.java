package org.apache.commons.math3.optimization.linear;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer;
import org.apache.commons.math3.optimization.linear.LinearConstraint;
import org.apache.commons.math3.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math3.optimization.linear.SimplexSolver;
import org.apache.commons.math3.optimization.linear.SimplexTableau;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.apache.commons.math3.linear.OpenMapRealVector;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.optimization.linear.Relationship;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer;
import org.apache.commons.math3.optimization.linear.LinearConstraint;
import org.apache.commons.math3.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math3.optimization.linear.SimplexSolver;
import org.apache.commons.math3.optimization.linear.SimplexTableau;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SimplexSolver_ESTest extends SimplexSolver_ESTest_scaffolding {@Test(timeout = 4000)
  public void test_0000()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[9];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100.0);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(100, AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS);
  }

  @Test(timeout = 4000)
  public void test_0001()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-1.0), 0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 100;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, false);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100.0);
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0002()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      PointValuePair pointValuePair1 = simplexSolver0.doOptimize();
      assertNotSame(pointValuePair1, pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test_0003()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0004()  throws Throwable  {
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(3043, (-1880.0));
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 5.538565518604807E-10);
      GoalType goalType0 = GoalType.MAXIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      // Undeclared exception!
      simplexSolver0.doOptimize();
  }

  @Test(timeout = 4000)
  public void test_0005()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0006()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(5342, 5342);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 5342);
      // Undeclared exception!
      simplexSolver0.doIteration(simplexTableau0);
  }

  @Test(timeout = 4000)
  public void test_0007()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      simplexSolver0.setMaxIterations((-2368));
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,368) exceeded
         //
         verifyException("org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0008()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0009()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(100, AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS);
  }

  @Test(timeout = 4000)
  public void test_0010()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0, (-1217));
      assertEquals(0, simplexSolver0.getIterations());
  }

  @Test(timeout = 4000)
  public void test_0011()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0012()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0013()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100);
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0014()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0015()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      PointValuePair pointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(pointValuePair1.equals((Object)pointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0016()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0017()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[3];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-745.8), 100);
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0018()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-3403.2290816218));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0E-12);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(100, AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS);
  }

  @Test(timeout = 4000)
  public void test_0019()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(10.0, 0);
      assertEquals(100, AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS);
  }

  @Test(timeout = 4000)
  public void test_0020()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-3403.2290816218));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      PointValuePair pointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(pointValuePair1.equals((Object)pointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0021()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0022()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0023()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      simplexSolver0.setMaxIterations((-1));
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1) exceeded
         //
         verifyException("org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0024()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 100;
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0025()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[5];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.5);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-3630.5425848177));
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(0, simplexSolver0.getIterations());
  }

  @Test(timeout = 4000)
  public void test_0026()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0, (-2724));
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, (-873.4028));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      PointValuePair pointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(pointValuePair1.equals((Object)pointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0027()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0028()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0029()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      simplexSolver0.setMaxIterations((-1919));
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,919) exceeded
         //
         verifyException("org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0030()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0031()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[15];
      doubleArray0[1] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0032()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(1.0, 1919);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 1.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0).when(linearConstraint0).getRelationship();
      doReturn((double)1919, 1.0).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 1913.5068299202424);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1919, 100);
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0033()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(0, 0.0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 100, 100);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(100, AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS);
  }

  @Test(timeout = 4000)
  public void test_0034()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-1362.960056), 1919);
      double[] doubleArray0 = new double[0];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1362.960056));
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0).when(linearConstraint0).getRelationship();
      doReturn((-381.2804611), (-1362.960056)).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-381.2804611), 1919);
      try { 
        simplexSolver0.solvePhase1(simplexTableau0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0035()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0036()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(1919, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      // Undeclared exception!
      simplexSolver0.doOptimize();
  }

  @Test(timeout = 4000)
  public void test_0037()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-1362.960056), 1919);
      double[] doubleArray0 = new double[0];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1362.960056));
      ArrayRealVector arrayRealVector0 = new ArrayRealVector();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0).when(linearConstraint0).getRelationship();
      doReturn((-381.2804611), (-1362.960056)).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no feasible solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0038()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0039()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(1.0, 1919);
      double[] doubleArray0 = new double[0];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0).when(linearConstraint0).getRelationship();
      doReturn((double)1919, 1.0).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test_0040()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0041()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0, (RealVector) null).when(linearConstraint0).getCoefficients();
      doReturn(relationship0, (Relationship) null).when(linearConstraint0).getRelationship();
      doReturn((double)1919, 1.0, 0.0, 0.0).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexTableau", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0042()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      Relationship relationship0 = Relationship.LEQ;
      LinearConstraint linearConstraint0 = mock(LinearConstraint.class, new ViolatedAssumptionAnswer());
      doReturn(arrayRealVector0).when(linearConstraint0).getCoefficients();
      doReturn(relationship0).when(linearConstraint0).getRelationship();
      doReturn((double)1919, 1.0).when(linearConstraint0).getValue();
      linkedList0.add(linearConstraint0);
      ArrayRealVector arrayRealVector1 = new ArrayRealVector(arrayRealVector0, arrayRealVector0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector1, 100);
      GoalType goalType0 = GoalType.MAXIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0043()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[2];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 430.535828);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(0, simplexSolver0.getIterations());
  }

  @Test(timeout = 4000)
  public void test_0044()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(870.7749, 272);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(272);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 1142.2476320767);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1042.8191772, 272);
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0045()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(514, 514);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 0.7853981633974483);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      PointValuePair pointValuePair1 = simplexSolver0.doOptimize();
      assertNotSame(pointValuePair1, pointValuePair0);
  }

  @Test(timeout = 4000)
  public void test_0046()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0047()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(1318);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1318);
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      // Undeclared exception!
      simplexSolver0.doOptimize();
  }

  @Test(timeout = 4000)
  public void test_0048()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0049()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      simplexSolver0.setMaxIterations((-1119));
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-1,119) exceeded
         //
         verifyException("org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0050()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 100;
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0051()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(2175, 2175);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 2175);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0, 100);
      try { 
        simplexSolver0.doIteration(simplexTableau0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0052()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver(0.0, 33);
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 0.0);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 0.0);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 100, 33);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(0, simplexSolver0.getIterations());
  }

  @Test(timeout = 4000)
  public void test_0053()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0054()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(2821, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 526.1860244732);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      // Undeclared exception!
      simplexSolver0.doOptimize();
  }

  @Test(timeout = 4000)
  public void test_0055()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0056()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(2175, 2175);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 2175);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0, 100);
      // Undeclared exception!
      simplexSolver0.doIteration(simplexTableau0);
  }

  @Test(timeout = 4000)
  public void test_0057()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test_0058()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(100, 100, (-20.54475573991525));
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, (-191.0));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      PointValuePair pointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(pointValuePair1.equals((Object)pointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0059()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }
@Test(timeout = 4000)
  public void test_0060()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver((-475.7094840286558), 119);
      double[] doubleArray0 = new double[6];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.5);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      simplexSolver0.solvePhase1(simplexTableau0);
      assertEquals(100, AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS);
  }

  @Test(timeout = 4000)
  public void test_0061()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      double[] doubleArray0 = new double[0];
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
      PointValuePair pointValuePair1 = simplexSolver0.doOptimize();
      assertFalse(pointValuePair1.equals((Object)pointValuePair0));
  }

  @Test(timeout = 4000)
  public void test_0062()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.solvePhase1((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0063()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(2026, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      GoalType goalType0 = GoalType.MINIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      // Undeclared exception!
      simplexSolver0.doOptimize();
  }

  @Test(timeout = 4000)
  public void test_0064()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doOptimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0065()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      simplexSolver0.setMaxIterations((-2801));
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (-2,801) exceeded
         //
         verifyException("org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0066()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      // Undeclared exception!
      try { 
        simplexSolver0.doIteration((SimplexTableau) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test_0067()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(2823, (-1210.8));
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, (-1997.1326963181134));
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
      SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
      // Undeclared exception!
      simplexSolver0.doIteration(simplexTableau0);
  }

  @Test(timeout = 4000)
  public void test_0068()  throws Throwable  {
      SimplexSolver simplexSolver0 = new SimplexSolver();
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(100, 100);
      LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(arrayRealVector0, 100);
      LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
      GoalType goalType0 = GoalType.MAXIMIZE;
      try { 
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // unbounded solution
         //
         verifyException("org.apache.commons.math3.optimization.linear.SimplexSolver", e);
      }
  }
}
